import java.awt.*;

public class PointCom implements Comparable<PointCom> {
    private Point p;

    public PointCom(Point p){
        this.p = new Point(p);
    }

    public int compareTo(PointCom p){
        if (this.p.getX() == p.getX()){
            return (int) (this.p.getY()-p.getY());
        }else {
            return (int) (this.p.getX() - p.getX());
        }
    }

    public void translate(int x,int y){
        p.translate(x,y);
    }

    public double getX(){
        return p.getX();
    }

    public double getY(){
        return p.getY();
    }
}
