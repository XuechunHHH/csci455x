// Name:
// USC NetID:
// CSCI455 PA2
// Spring 2023


/**
 * Class BookshelfKeeper
 *
 * Enables users to perform efficient putPos or pickHeight operation on a bookshelf of books kept in
 * non-decreasing order by height, with the restriction that single books can only be added
 * or removed from one of the two *ends* of the bookshelf to complete a higher level pick or put
 * operation.  Pick or put operations are performed with minimum number of such adds or removes.
 */
public class BookshelfKeeper {

    /**
     Representation invariant:

     bookshelf: store the height of books in ascending sequence

     */

    // <add instance variables here>
    private Bookshelf bookshelf;
    private int calls = 0;
    private int totalCalls = 0;


    /**
     * Creates a BookShelfKeeper object with an empty bookshelf
     */
    public BookshelfKeeper() {
        bookshelf = new Bookshelf();

        assert isValidBookshelfKeeper();
    }

    /**
     * Creates a BookshelfKeeper object initialized with the given sorted bookshelf.
     * Note: method does not make a defensive copy of the bookshelf.
     *
     * PRE: sortedBookshelf.isSorted() is true.
     */
    public BookshelfKeeper(Bookshelf sortedBookshelf) {
        bookshelf = sortedBookshelf;

        assert isValidBookshelfKeeper();
    }

    /**
     * Removes a book from the specified position in the bookshelf and keeps bookshelf sorted
     * after picking up the book.
     *
     * Returns the number of calls to mutators on the contained bookshelf used to complete this
     * operation. This must be the minimum number to complete the operation.
     *
     * PRE: 0 <= position < getNumBooks()
     */
    public int pickPos(int position) {
        int num = bookshelf.getHeight(position);
        int front = position;
        int back = position;

        for (int i=position-1;i>=0;--i){
            if (bookshelf.getHeight(i) != num){
                front  = i+1;
                break;
            }
        }

        for (int i=position+1;i<bookshelf.size();++i){
            if (bookshelf.getHeight(i) != num){
                back = i-1;
                break;
            }
        }

        back = bookshelf.size()-back-1;
        if (front<=back){    // decide which end to pick
            calls = 2*front+1;   // calculate the calls used this operation
            totalCalls += calls;    // update the totalcalls
            Bookshelf temps = new Bookshelf();
            for (int i=0;i<=front;++i){     // remove the books when index<=position and store it in a temporary bookshelf
                int temp = bookshelf.removeFront();
                temps.addLast(temp);
            }
            temps.removeLast();  // delete the book which will be removed
            for (int i=0;i<front;++i){   // put the other books back in order
                int temp = temps.removeLast();
                bookshelf.addFront(temp);
            }
        } else {    // remove from the back end
            calls = 2*back+1;
            totalCalls += calls;
            Bookshelf temps = new Bookshelf();
            for (int i=0;i<=back;++i){   // remove the books when index>=position and store it in a temporary bookshelf
                int temp = bookshelf.removeLast();
                temps.addFront(temp);
            }
            temps.removeFront();   // delete the book which will be removed
            for (int i=0;i<back;++i){    // put the other books back in order
                int temp = temps.removeFront();
                bookshelf.addLast(temp);
            }
        }
        assert isValidBookshelfKeeper();
        return calls;   // dummy code to get stub to compile
    }

    /**
     * Inserts book with specified height into the shelf.  Keeps the contained bookshelf sorted
     * after the insertion.
     *
     * Returns the number of calls to mutators on the contained bookshelf used to complete this
     * operation. This must be the minimum number to complete the operation.
     *
     * PRE: height > 0
     */
    public int putHeight(int height) {
        if (bookshelf.size() == 0){    // if the bookshelf is empty, just add the new book
            bookshelf.addFront(height);
            calls = 1;
            totalCalls += calls;
            assert isValidBookshelfKeeper();
            return calls;
        }

        int front = bookshelf.size();   // the books before if insert from the left end
        for (int i=0;i<bookshelf.size();++i){
            if (bookshelf.getHeight(i) >= height) {
                front = i;
                break;
            }
        }

        int back = 0;   // the books before if insert from the right end
        for (int i=0;i<bookshelf.size();++i){
            if (bookshelf.getHeight(i) > height) {
                back = bookshelf.size()-i;
                break;
            }
        }

        if (front<=back){       // insert from the left end
            calls = 2*front+1;          // calculate the calls to insert
            totalCalls += calls;         // update the totalCalls
            Bookshelf temps = new Bookshelf();
            for (int i=0;i<front;++i){          // remove the books whose height is smaller than the new book's
                int temp = bookshelf.removeFront();
                temps.addLast(temp);
            }
            bookshelf.addFront(height);   // put the new book on the shelf
            for (int i=0;i<front;++i){        // put the other books back
                int temp = temps.removeLast();
                bookshelf.addFront(temp);
            }
        }else{             // insert from the right end
            calls = 2*back+1;
            totalCalls += calls;
            Bookshelf temps = new Bookshelf();
            for (int i=0;i<back;++i){   // remove the books whose height is lager than the new book's
                int temp = bookshelf.removeLast();
                temps.addFront(temp);
            }
            bookshelf.addLast(height);         // put the new book on the shelf
            for (int i=0;i<back;++i){          // put the other books back
                int temp = temps.removeFront();
                bookshelf.addLast(temp);
            }
        }
        assert isValidBookshelfKeeper();
        return calls;
    }

    /**
     * Returns the total number of calls made to mutators on the contained bookshelf
     * so far, i.e., all the ones done to perform all of the pick and put operations
     * that have been requested up to now.
     */
    public int getTotalOperations() {

        return totalCalls;
    }

    /**
     * Returns the number of books on the contained bookshelf.
     */
    public int getNumBooks() {

        return bookshelf.size();
    }

    /**
     * Returns string representation of this BookshelfKeeper. Returns a String containing height
     * of all books present in the bookshelf in the order they are on the bookshelf, followed
     * by the number of bookshelf mutator calls made to perform the last pick or put operation,
     * followed by the total number of such calls made since we created this BookshelfKeeper.
     *
     * Example return string showing required format: ¡°[1, 3, 5, 7, 33] 4 10¡±
     *
     */
    public String toString() {

        return bookshelf.toString()+" "+calls+" "+totalCalls;

    }

    /**
     * Returns true iff the BookshelfKeeper data is in a valid state.
     * (See representation invariant comment for details.)
     */
    private boolean isValidBookshelfKeeper() {
        if (!bookshelf.isSorted()) return false;  // check if the bookshelf is in well-sorted
        if (bookshelf.size() != 0 && bookshelf.getHeight(0) <= 0) return false;   // check if the height of books are all >= 0
        if (totalCalls < calls) return false;   // the totalCalls is always >= calls
        return true;
    }

    // add any other private methods here
}
