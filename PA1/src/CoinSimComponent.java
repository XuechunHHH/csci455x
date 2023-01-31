import javax.swing.*;
import java.awt.*;

public class CoinSimComponent extends JComponent {
    private int applicationHeight1;
    private int applicationHeight2;
    private int applicationHeight3;

    // CoinSimComponent constructor
    public CoinSimComponent(int numTrials){
        // run the trial
        CoinTossSimulator toss = new CoinTossSimulator();
        toss.run(numTrials);
        applicationHeight1 = toss.getTwoHeads();
        applicationHeight2 = toss.getHeadTails();
        applicationHeight3 = toss.getTwoTails();
    }

    // calculate the position of the component and pass the parameter to bars to paint them
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        // get the width and height of the frame
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        // set vb
        int bolder = 24;
        // get the position of bottom
        int bottom = frameHeight - bolder;
        // set width of the bar
        int width = 30;
        // get the x position of each bar
        int left1 = frameWidth / 4 - width/2;
        int left2 = frameWidth / 4 + left1;
        int left3 = frameWidth / 4 + left2;
        float total = applicationHeight1 + applicationHeight2 + applicationHeight3;
        // get the scale after trials
        float scale = (frameHeight - bolder * 2) / total;
        // get the pct of each bar in the label
        int pct1 =  Math.round(applicationHeight1 / total * 100);
        int pct2 =  Math.round(applicationHeight2 / total * 100);
        int pct3 =  Math.round(applicationHeight3 / total * 100);

        // pass the parameters to bar
        Bar bar1 = new Bar(bottom,left1,width,applicationHeight1,scale,Color.RED,"Two Heads: "+applicationHeight1+"("+pct1+"%)");
        Bar bar2 = new Bar(bottom,left2,width,applicationHeight2,scale,Color.GREEN,"A Head and a Tail: "+applicationHeight2+"("+pct2+"%)");
        Bar bar3 = new Bar(bottom,left3,width,applicationHeight3,scale,Color.BLUE,"Two Tails: "+applicationHeight3+"("+pct3+"%)");
        // draw the bars
        bar1.draw(g2);
        bar2.draw(g2);
        bar3.draw(g2);
    }
}
