// Name: Xuechun Hua
// USC NetID: xuechunh
// CS 455 PA4
// Spring 2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * A dictionary of all anagram sets.
 * Note: the processing is case-sensitive; so if the dictionary has all lower
 * case words, you will likely want any string you test to have all lower case
 * letters too, and likewise if the dictionary words are all upper case.
 */
public class AnagramDictionary {

	/**
	 * Representation invariant:
	 * 1.The key must be a sorted string in alphabetical order, like "aclm".
	 * 2.There is no duplicate string in the set value. For key = "aclm", the value is like "{calm,clam}"
	 */
	private Map<String, Set<String>> anagramDic;

	/**
	 * Create an anagram dictionary from the list of words given in the file
	 * indicated by fileName.
	 *
	 * @param fileName the name of the file to read from
	 * @throws FileNotFoundException      if the file is not found
	 * @throws IllegalDictionaryException if the dictionary has any duplicate words
	 */
	public AnagramDictionary(String fileName) throws FileNotFoundException, IllegalDictionaryException {
		File inFile = new File(fileName);
		anagramDic = new HashMap<>();
		try (Scanner sc = new Scanner(inFile)) {
			while (sc.hasNext()) {
				String word = sc.next();
				String key = preProcess(word);
				Set<String> value = anagramDic.get(key);
				if (value == null) {
					Set<String> set = new HashSet<>();
					set.add(word);
					anagramDic.put(key, set);
				} else {
					if (value.contains(word)) {
						throw new IllegalDictionaryException("ERROR: Illegal dictionary: dictionary file has a duplicate word: " + word);
					} else {
						value.add(word);
						anagramDic.put(key, value);
					}
				}
			}
		}
	}


	/**
	 * Get all anagrams of the given string. This method is case-sensitive.
	 * E.g. "CARE" and "race" would not be recognized as anagrams.
	 *
	 * @param string string to process
	 * @return a list of the anagrams of s
	 */
	public ArrayList<String> getAnagramsOf(String string) {
		String key = preProcess(string);
		Set<String> set = anagramDic.getOrDefault(key, new HashSet<>());
		return new ArrayList<String>(set);
	}

	/**
	 * Sort the character in the input string in alphabetical order.
	 * E.g. "clam" after preProcess will be "aclm".
	 *
	 * @param word
	 * @return
	 */
	private String preProcess(String word) {
		return word.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}
}
