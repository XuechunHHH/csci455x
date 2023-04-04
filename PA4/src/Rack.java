// Name: Xuechun Hua
// USC NetID: xuechunh
// CS 455 PA4
// Spring 2023

import java.util.*;

/**
 * A Rack of Scrabble tiles
 */

public class Rack {

	/**
	 * private instance variable
	 */
	private AnagramDictionary anagramDictionary;
	private ScoreTable scoreTable;

	/**
	 * Initialize a Rack
	 *
	 * @param anagramDictionary
	 * @param scoreTable
	 */
	public Rack(AnagramDictionary anagramDictionary, ScoreTable scoreTable) {
		this.anagramDictionary = anagramDictionary;
		this.scoreTable = scoreTable;
	}

	/**
	 * Finds all subsets of the multiset starting at position k in unique and mult.
	 * unique and mult describe a multiset such that mult[i] is the multiplicity of the char
	 * unique.charAt(i).
	 * PRE: mult.length must be at least as big as unique.length()
	 * 0 <= k <= unique.length()
	 *
	 * @param unique a string of unique letters
	 * @param mult   the multiplicity of each letter from unique.
	 * @param k      the smallest index of unique and mult to consider.
	 * @return all subsets of the indicated multiset.  Unlike the multiset in the parameters,
	 * each subset is represented as a String that can have repeated characters in it.
	 * @author Claire Bono
	 */
	private ArrayList<String> allSubsets(String unique, int[] mult, int k) {
		ArrayList<String> allCombos = new ArrayList<>();

		if (k == unique.length()) {  // multiset is empty
			allCombos.add("");
			return allCombos;
		}

		// get all subsets of the multiset without the first unique char
		ArrayList<String> restCombos = allSubsets(unique, mult, k + 1);

		// prepend all possible numbers of the first char (i.e., the one at position k)
		// to the front of each string in restCombos.  Suppose that char is 'a'...

		String firstPart = "";          // in outer loop firstPart takes on the values: "", "a", "aa", ...
		for (int n = 0; n <= mult[k]; n++) {
			for (int i = 0; i < restCombos.size(); i++) {  // for each of the subsets
				// we found in the recursive call
				// create and add a new string with n 'a's in front of that subset
				allCombos.add(firstPart + restCombos.get(i));
			}
			firstPart += unique.charAt(k);  // append another instance of 'a' to the first part
		}

		return allCombos;
	}

	/**
	 * Sort the characters in rack in ascending order and make every character unduplicated.
	 * Count the occurrences of each character in rack and store them in an array.
	 * E.g. When the input rack is "character", the output is {"acehrt" : [2,2,1,1,2,1]}.
	 *
	 * @param rack
	 * @return unique string in ascending order in rack -> character occurrences in rack
	 */
	private Map<String, int[]> preProcess(String rack) {
		String unique = rack.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		int[] mult = new int[unique.length()];
		for (int i = 0; i < unique.length(); ++i) {
			for (int j = 0; j < rack.length(); ++j) {
				if (rack.charAt(j) == unique.charAt(i)) {
					mult[i]++;
				}
			}
		}
		Map<String, int[]> res = new HashMap<>();
		res.put(unique, mult);
		return res;
	}

	/**
	 * Read the rack and get allSubsets of it.
	 * Get anagrams and score of each subset word and store in an arraylist.
	 * Sort the arraylist by entry's value in descending order and then by key in ascending order.
	 *
	 * @param rack
	 * @return sortedScrabble All possible scrabbles in order.
	 */
	public ArrayList<Map.Entry<String, Integer>> getScrabble(String rack) {
		Map.Entry<String, int[]> occur = preProcess(rack).entrySet().stream().findFirst().orElse(null);
		Map<String, Integer> scrabbles = new TreeMap<>();
		ArrayList<String> allSubsets = allSubsets(occur.getKey(), occur.getValue(), 0);
		for (String subset : allSubsets) {
			ArrayList<String> anagrams = anagramDictionary.getAnagramsOf(subset);
			int score = scoreTable.getScore(subset);
			for (String anagram : anagrams) {
				scrabbles.put(anagram, score);
			}
		}
		ArrayList<Map.Entry<String, Integer>> sortedScrabble = new ArrayList<>(scrabbles.entrySet());
		Collections.sort(sortedScrabble, new decByVal());
		return sortedScrabble;
	}

}

/**
 * Define a sorting order for Map.Entry<String,Integer>.
 * Sort the entries by value in descending order.
 * When the values are equal, sort the entries by key in alphabetical order.
 */
class decByVal implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		return o2.getValue() - o1.getValue();
	}
}