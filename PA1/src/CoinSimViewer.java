import javax.swing.JFrame;
import java.util.Scanner;

public class CoinSimViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        // set the size of the frame
        frame.setSize(800, 500);
        // set frame title
        frame.setTitle("CoinSim");
        // set the programme terminate when clicking on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // get the number of trials
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of trials:");
        int numTrials = in.nextInt();
        // if the number is invalid, return error
        if (numTrials <= 0 ){
            System.out.println("ERROR: Number entered must be greater than 0.");
            return;
        }
        CoinSimComponent component = new CoinSimComponent(numTrials);
        // add the bar component to the frame
        frame.add(component);
        frame.setVisible(true);
    }
}