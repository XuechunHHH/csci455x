import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PointString {
    public static void main(String[] args) {
        Map<Point,String> myMap = new HashMap<>();
        Point p = new Point(15,84);
        myMap.put(p,"house");
        p.translate(10,-10);
        myMap.put(p,"school");
        printVal(myMap,p);
        printVal(myMap,new Point(15,84));
        printVal(myMap,new Point(25,74));
        printVal(myMap,new Point(36,12));
    }

    public static void printVal(Map<Point,String> myMap, Point targetKey){
        String val = myMap.get(targetKey);
        if(val == null){
            System.out.println("no such entry");
        }else{
            System.out.println(val);
        }
    }
}
