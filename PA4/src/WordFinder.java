// Name: Xuechun Hua
// USC NetID: xuechunh
// CS 455 PA4
// Spring 2023

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * WordFinder -- main class for a console Scrabble Game
 *
 * To run it from command line:
 * java WordFinder [anagramDictionary file]
 */
public class WordFinder {
	public static void main(String[] args) {
		String defaultDic = "sowpods.txt";
		String file = args.length > 0 ? args[0] : defaultDic;
		AnagramDictionary anagramDictionary = readDictionary(file);
	   if (anagramDictionary == null) {
			return;
		}
		Rack rack = new Rack(anagramDictionary, new ScoreTable());
		System.out.println("Type . to quit.");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Rack? ");
			String next = sc.next();
			if (next.equals(".")) {
				break;
			}
			ArrayList<Map.Entry<String, Integer>> scrabbles = rack.getScrabble(next);
			int size = scrabbles.size();
			System.out.println("We can make " + size + " words from \"" + next + "\"");
			if (size > 0){
				System.out.println("All of the words with their scores (sorted by score):");
				for (Map.Entry<String,Integer> entry: scrabbles){
					System.out.println(entry.getValue()+": "+entry.getKey());
				}
			}
		}
	}

	/**
	 * Initialize an anagramDictionary from a given file.
	 * When encountering errors, report the error and exist the program.
	 * @param file
	 * @return anagramDictionary
	 */
	private static AnagramDictionary readDictionary(String file) {
		AnagramDictionary anagramDictionary = null;
		try {
			anagramDictionary = new AnagramDictionary(file);
		} catch (IllegalDictionaryException e) {
			System.out.println(e.getMessage());
			System.out.println("Exiting program.");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Dictionary file \"" + file + "\" does not exist.");
			System.out.println("Exiting program.");
		}
		return anagramDictionary;
	}
}
