import java.awt.*;
import java.util.Set;
import java.util.TreeSet;

public class TreePoint{
    public static void main(String[] args) {
        Set<PointCom> set = new TreeSet<>();
        Point p= new Point(10,12);
        PointCom pc = new PointCom(p);
        set.add(pc);
        Point p2 = new Point(13,15);
        PointCom p2c = new PointCom(p2);
        set.add(p2c);
        Point p3 = new Point(3,5);
        PointCom p3c = new PointCom(p3);
        set.add(p3c);
        p3c.translate(20,22);

        Point p4 = new Point(23,27);
        System.out.println(set.contains(new PointCom(p4)));

    }

}
