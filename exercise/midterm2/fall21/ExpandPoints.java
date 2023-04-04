import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ExpandPoints {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(13,12));
        points.add(new Point(9,-9));
        points.add(new Point(-10,-5));
        points.add(new Point(5,6));
        expand(points);
        System.out.println(points.toString());
    }

    public static void expand(ArrayList<Point> points){
        points.forEach(new PointsEx());
    }
}

class PointsEx implements Consumer<Point>{
    public void accept(Point p){
        p.translate((int) p.getX(), (int) p.getY());
    }
}
