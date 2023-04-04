import java.io.PrintStream;

public class BarGraph extends Graph{
    private int numBars;
    public BarGraph(int numBars){
        this.numBars = numBars;
    }

    public void show(PrintStream ps, int size){
        ps.println("Littlefinger");
    }

    public void show(PrintStream ps){ps.println("Tyrion");}

    public void show(int size){
        System.out.println("Arya");
    }

    public int getNumBars(){return numBars;}
}
