import java.util.ArrayList;

public class BookshelfTester {
    public static void main(String[] args) {
        // test the first constructor and toString() method
        Bookshelf empty = new Bookshelf();
        System.out.println("Expected: []");
        System.out.println(empty.toString());

        System.out.println("---------------------------------------------------");

        // test the second constructor and toString() method
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(10);
        arr.add(10);
        arr.add(14);
        Bookshelf bookshelf = new Bookshelf(arr);
        System.out.println("Expected: [2,3,7,10,10,14]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the addFront method in Bookshelf
//        bookshelf.addFront(3); // Expected: throw an Error
        bookshelf.addFront(1);
        System.out.println("Expected: [1,2,3,7,10,10,14]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the removeFront method in Bookshelf
        bookshelf.removeFront();
        System.out.println("Expected: [2,3,7,10,10,14]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the addLast method in Bookshelf
        bookshelf.addLast(16);
        System.out.println("Expected: [2,3,7,10,10,14,16]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the removeLast method in Bookshelf
        bookshelf.removeLast();
        System.out.println("Expected: [2,3,7,10,10,14]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the getHeight method in Bookshelf
        int height = bookshelf.getHeight(3);
        System.out.println("Expected: 10");
        System.out.println(height);

        System.out.println("---------------------------------------------------");

        // test the size method in Bookshelf
        int size = bookshelf.size();
        System.out.println("Expected: 6");
        System.out.println(size);

        System.out.println("---------------------------------------------------");

        // test the isSorted method in Bookshelf (with assertion off)
        boolean sort = bookshelf.isSorted();
        System.out.println("Expected: true");
        System.out.println(sort);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(14);
        arr1.add(2);
        arr1.add(10);
        arr1.add(7);
        arr1.add(14);
        Bookshelf bookshelf1 = new Bookshelf(arr1);
        boolean sort1 = bookshelf1.isSorted();
        System.out.println("Expected: false");
        System.out.println(sort1);


        System.out.println("---------------------------------------------------");
    }
}
