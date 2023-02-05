import java.util.ArrayList;

public class TestAssert {
    public static void main(String[] args) {
        // test the first constructor with and without Assertions
        Bookshelf empty = new Bookshelf();
        System.out.println("Expected: []");
        System.out.println(empty.toString());

        System.out.println("---------------------------------------------------");

        // test the second constructor with and without Assertions
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(14);
        arr.add(10);
        arr.add(7);
        arr.add(2);
        arr.add(10);
        Bookshelf bookshelf = new Bookshelf(arr);
        System.out.println("Expected: [2,3,7,10,10,14]");
        System.out.println(bookshelf.toString());

        System.out.println("---------------------------------------------------");

        // test the method isValidBookshelf in Bookshelf
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(14);
        arr1.add(10);
        arr1.add(7);
        arr1.add(2);
        arr1.add(-10);  // throw Error with Assertion turn on
        Bookshelf bookshelf1 = new Bookshelf(arr1);
        System.out.println("Expected: [-10,2,3,7,10,14]");  // with Assertion turn off
        System.out.println(bookshelf1.toString());

        System.out.println("---------------------------------------------------");
    }
}
