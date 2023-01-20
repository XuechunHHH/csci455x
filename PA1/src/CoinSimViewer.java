import javax.swing.JFrame;
import java.util.Scanner;

public class CoinSimViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(800, 500);
        frame.setTitle("CoinSim");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of trials:");
        int numTrials = in.nextInt();
        if (numTrials <= 0 ){
            System.out.println("ERROR: Number entered must be greater than 0.");
            return;
        }
        CoinSimComponent component = new CoinSimComponent(numTrials);
        frame.add(component);

        frame.setVisible(true);
    }
}