import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * BookshelfKeeperProgram
 * BookshelfKeeperProg contains the main method that allows the user to perform
 * a series of pickPos and putHeight operations on a bookshelf in an interactive
 * mode with user commands called pick and put.  It can also be run in a batch
 * mode by using input and output redirection.
 */

public class BookshelfKeeperProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter initial arrangement of books followed by newline: ");
        String initial = in.nextLine();

        Scanner toArr = new Scanner(initial);
        ArrayList<Integer> array = new ArrayList<>();
        while(toArr.hasNextInt()){
            array.add(toArr.nextInt());
        }

        boolean flag = isSorted(array);
        if (!flag){   // throw error if the bookshelf is not in non-decreasing order
            System.out.println("ERROR: Heights must be specified in non-decreasing order.");
        } else if (array.size()!=0 && array.get(0) <= 0){     // throw error if a book on the bookshelf has negative height
            System.out.println("ERROR: Height of a book must be positive.");
        } else{      // do puts and picks
            bookSort(in,array);
        }
        System.out.println("Exiting Program.");

    }

    private static boolean isSorted(ArrayList<Integer> bookshelf) {
        ArrayList<Integer> copyBookshelf = new ArrayList<>(bookshelf);  // copy the bookshelf
        copyBookshelf.sort(Comparator.naturalOrder()); // sort the copy
        if(copyBookshelf.equals(bookshelf)) return true;
        return false;
    }

    private static void bookSort(Scanner in,ArrayList<Integer> array){
        Bookshelf bookshelf = new Bookshelf(array);
        BookshelfKeeper bookshelfKeeper = new BookshelfKeeper(bookshelf);

        System.out.println(bookshelfKeeper.toString());

        System.out.println("Type pick <index> or put <height> followed by newline. Type end to exit.");

        String ope  = in.next();
        while (!ope.equals("end")){
            int num = in.nextInt();
            if (ope.equals("pick")){
                if (num >= bookshelfKeeper.getNumBooks()){
                    System.out.println("ERROR: Entered pick operation is invalid on this shelf.");
                    break;
                }
                bookshelfKeeper.pickPos(num);
                System.out.println(bookshelfKeeper.toString());
            } else if(ope.equals("put")){
                if (num <= 0){
                    System.out.println("ERROR: Height of a book must be positive.");
                    break;
                }
                bookshelfKeeper.putHeight(num);
                System.out.println(bookshelfKeeper.toString());
            } else{
                System.out.println("ERROR: Invalid command. Valid commands are pick, put, or end.");
                break;
            }
            ope = in.next();
        }
    }
}
