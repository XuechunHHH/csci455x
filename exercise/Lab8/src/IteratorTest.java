import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(-7);
        list.addLast(-4);
        list.addLast(0);
        list.addLast(3);
        list.addLast(5);
        list.addLast(8);

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.next());
    }
}
