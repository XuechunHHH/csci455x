// Name: Xuechun Hua
// USC NetID: xuechunh
// CS 455 PA4
// Spring 2023

/**
 * A table to store points for each character.
 * The representation for the table is an int array, which length is 26.
 * The array stores point for a character at the index of 'character'-'a'.
 * E.g. 'e'-'a' = 4 and int[4] is the point for 'e'.
 * This class is case-insensitive. E.g. 'e' has the same point as 'E'.
 */
public class ScoreTable {

	/**
	 * Representation invariant:
	 * 1.The array length must be 26.
	 * 2.The value in array must be hard-coded values as following:
	 * (1 point)-A, E, I, O, U, L, N, S, T, R
	 * (2 points)-D, G
	 * (3 points)-B, C, M, P
	 * (4 points)-F, H, V, W, Y
	 * (5 points)-K
	 * (8 points)- J, X
	 * (10 points)-Q, Z
	 */
	private int[] scoreTable = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

	/**
	 * Compute the points for the word input according to the scoreTable.
	 *
	 * @param word
	 * @return points points for the word
	 */
	public int getScore(String word) {
		word = word.toLowerCase();
		int points = 0;
		for (int i = 0; i < word.length(); ++i) {
			points += scoreTable[word.charAt(i) - 'a'];
		}
		return points;
	}
}
