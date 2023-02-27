/*
 * Contains isSorted method and
 * tests it on a bunch of hardcoded test cases, printing out test
 * data, actual results, and a FAILED message if actual results don't
 * match expected results.
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IsSortedTester {

    /*
     * isSorted.  Returns true iff the list is a non-decreasing sequence of integers.
     */
    public static boolean isSorted(LinkedList<Integer> list) {

        ListIterator<Integer> iterator = list.listIterator();
        int previous;
        if (iterator.hasNext()){
            previous = iterator.next();
        }else{
            return true;
        }

        while (iterator.hasNext()){
            int temp = iterator.next();
            if(temp < previous){
                return false;
            }
            previous = temp;
        }
        return true;
    }


    public static void main(String args[]) {

        testIsSorted("", true);
        testIsSorted("3", true);
        testIsSorted("3 4", true);
        testIsSorted("4 2", false);
        testIsSorted("3 7 5", false);
        testIsSorted("3 3 3", true);
        testIsSorted("3 4 5 3", false);
        testIsSorted("3 4 5 3 5", false);
        testIsSorted("-7 0 3 7 9 9 11 20", true);
        testIsSorted("5 3 1", false);
        // test failed
        testIsSorted("5 3 1", true);
    }


    /*  Assumes the following format for listString parameter, shown by example
     * (first one is empty list):
     *   "", "3", "3 4", "3 4 5", etc.
     */
    private static LinkedList<Integer> makeList(String listString) {
        Scanner strscan = new Scanner(listString);

        LinkedList<Integer> list = new LinkedList<Integer>();

        while (strscan.hasNextInt()) {
            list.add(strscan.nextInt());
        }

        return list;
    }


    /* Test isSorted method on a list form of input given in listString
     * Prints test data, actual result, and a FAILED message if actual result
     * doesn't match expected result.
     * listString is a string form of a list given as a space separated
     * sequence of ints.  E.g.,
     *  "" (empty string), "3" (1 elmt string), "2 4" (2 elmt string), etc.
     *
     */
    private static void testIsSorted(String listString, boolean expectedResult) {

        LinkedList<Integer> list = makeList(listString);

        boolean result = isSorted(list);
        System.out.print("List: " + list
                + " isSorted? " + result);
        if (result != expectedResult) {
            System.out.print("...isSorted FAILED");
        }
        System.out.println();
    }
}
