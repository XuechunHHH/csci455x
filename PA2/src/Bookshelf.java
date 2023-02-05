// Name: 
// USC NetID: 
// CSCI455 PA2
// Spring 2023


import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class Bookshelf
 * Implements idea of arranging books into a bookshelf.
 * Books on a bookshelf can only be accessed in a specific way so books don¡¯t fall down;
 * You can add or remove a book only when it¡¯s on one of the ends of the shelf.   
 * However, you can look at any book on a shelf by giving its location (starting at 0).
 * Books are identified only by their height; two books of the same height can be
 * thought of as two copies of the same book.
 */

public class Bookshelf {

    /**
     Representation invariant:
     An array list to store the height sequence of books from short to tall
     */
    // <add instance variables here>
    private ArrayList<Integer> bookshelf;


    /**
     * Creates an empty Bookshelf object i.e. with no books
     * and judge whether it is a valid bookshelf.
     */
    public Bookshelf() {
        bookshelf = new ArrayList<>();
        assert isValidBookshelf();  // sample assert statement (you will be adding more of these calls)
    }

    /**
     * Creates a Bookshelf with the arrangement specified in pileOfBooks. Example
     * values: [20, 1, 9].
     *
     * PRE: pileOfBooks contains an array list of 0 or more positive numbers
     * representing the height of each book.
     */
    public Bookshelf(ArrayList<Integer> pileOfBooks) {
        bookshelf = pileOfBooks;  // initialize the bookshelf

        assert isValidBookshelf();  // check if the bookshelf is valid after initialization
    }

    /**
     * Inserts book with specified height at the start of the Bookshelf, i.e., it
     * will end up at position 0.
     *
     * PRE: height > 0 (height of book is always positive)
     */
    public void addFront(int height) {
//        if (height <=0 ) return;  // if the parameter height passing in is wrong, just skip

        bookshelf.add(0,height); // add the book with specified height to the bookshelf at index of 0

        assert isValidBookshelf();  // check if the bookshelf is valid after add the height to the front
    }

    /**
     * Inserts book with specified height at the end of the Bookshelf.
     *
     * PRE: height > 0 (height of book is always positive)
     */
    public void addLast(int height) {
        bookshelf.add(height);  // add the book with specified height to the end of the bookshelf

        assert  isValidBookshelf();  // check if the bookshelf is valid after add the height to the end
    }

    /**
     * Removes book at the start of the Bookshelf and returns the height of the
     * removed book.
     *
     * PRE: this.size() > 0 i.e. can be called only on non-empty BookShelf
     */
    public int removeFront() {
//        if (bookshelf.size()==0) return 0;   // if the bookshelf is already empty, return 0 directly

        int height = bookshelf.remove(0);  // remove the book with specified height from the bookshelf at index of 0
                                                 // and store the height of the removed book in height

        assert isValidBookshelf();  // check if the bookshelf is valid after remove the height from the front

        return height;   // return the height of the removed book
    }

    /**
     * Removes book at the end of the Bookshelf and returns the height of the
     * removed book.
     *
     * PRE: this.size() > 0 i.e. can be called only on non-empty BookShelf
     */
    public int removeLast() {
//        if (bookshelf.size()==0) return 0;   // if the bookshelf is already empty, return 0 directly

        int height = bookshelf.remove(bookshelf.size()-1);  // remove the book with specified height from the end of the bookshelf
                                                                  // and store the height of the removed book in height

        assert isValidBookshelf();  // check if the bookshelf is valid after remove the height from the end

        return height;   // return the height of the removed book
    }

    /*
     * Gets the height of the book at the given position.
     *
     * PRE: 0 <= position < this.size()
     */
    public int getHeight(int position) {
//        if (position < 0 || position >= bookshelf.size()) return 0; // if the parameter position passing in is wrong, just skip

        return bookshelf.get(position); // return the value stored at the index of position
    }

    /**
     * Returns number of books on the this Bookshelf.
     */
    public int size() {

        return bookshelf.size();

    }

    /**
     * Returns string representation of this Bookshelf. Returns a string with the height of all
     * books on the bookshelf, in the order they are in on the bookshelf, using the format shown
     * by example here:  ¡°[7, 33, 5, 4, 3]¡±
     */
    public String toString() {
        return bookshelf.toString();
    }

    /**
     * Returns true iff the books on this Bookshelf are in non-decreasing order.
     * (Note: this is an accessor; it does not change the bookshelf.)
     */
    public boolean isSorted() {
        ArrayList<Integer> copyBookshelf = new ArrayList<>(bookshelf);  // copy the bookshelf

        copyBookshelf.sort(Comparator.naturalOrder()); // sort the copy

        if(copyBookshelf.equals(bookshelf)) return true;
        return false;
    }

    /**
     * Returns true iff the Bookshelf data is in a valid state.
     * (See representation invariant comment for more details.)
     */
    private boolean isValidBookshelf() {
        if (!isSorted()) return false;  // check if the bookshelf is in well-sorted
        if (bookshelf.size() != 0 && bookshelf.get(0) <= 0) return false;   // check if the height of books are all >= 0
        return true;
    }

}