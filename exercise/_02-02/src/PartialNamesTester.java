/**
 Test Names class with hard-coded data.

 After in-class work, "Partial" version tests constructor, numNames,
 printNames, lookup and remove.
 */
public class PartialNamesTester {


    public static void main(String[] args) {

        Names empty = new Names();

        System.out.println("Names in empty list [exp: <empty>]: ");
        empty.printNames();
        System.out.println("Length of empty list [exp: 0]: "
                + empty.numNames());
        System.out.println();

        doOneLookup(empty,"Anne",false);

        System.out.println("---------------------------------------------------------------------------------");

        Names names = new Names();

        names.loadNames();
        System.out.println("Names in pre-loaded list [exp: Ann Bob Carol Don Ed]: ");
        names.printNames();
        System.out.println("Length of pre-loaded list [exp: 5]: "
                + names.numNames());
        System.out.println();

        doOneLookup(names,"Anne",true);
        doOneLookup(names,"Ed",true);
        doOneLookup(names,"Carol",true);
        doOneLookup(names,"",false);
        doOneLookup(names,"Donald",false);
        doOneLookup(names,"Alice",false);
    }


    /**
     Calls lookup and prints result, or failure message if actual result doesn't match
     expected result.
     @param names the object to do lookup on
     @param target the name to look up
     @param expectedResult expected return value of calling lookup with names and target
     */
    private static void doOneLookup(Names names, String target, boolean expectedResult) {
        System.out.print("Is " + target + " in the list? . . . ");
        if (names.lookup(target) != expectedResult) {
            System.out.println("FAILED: expected lookup to return " + expectedResult);
        }
        else {
            System.out.println(expectedResult);
        }
    }

}
