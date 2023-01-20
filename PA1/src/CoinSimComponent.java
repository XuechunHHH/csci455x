import javax.swing.*;
import java.awt.*;

public class CoinSimComponent extends JComponent {
    private int applicationHeight1;
    private int applicationHeight2;
    private int applicationHeight3;
    public CoinSimComponent(int numTrials){
        CoinTossSimulator toss = new CoinTossSimulator();
        toss.run(numTrials);
        applicationHeight1 = toss.getTwoHeads();
        applicationHeight2 = toss.getHeadTails();
        applicationHeight3 = toss.getTwoTails();
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int bolder = 24;
        int bottom = frameHeight - bolder;
        int width = 30;
        int left1 = frameWidth / 4 - width/2;
        int left2 = frameWidth / 4 + left1;
        int left3 = frameWidth / 4 + left2;
        float total = applicationHeight1 + applicationHeight2 + applicationHeight3;
        float scale = (frameHeight - bolder * 2) / total;
        int pct1 =  Math.round(applicationHeight1 * 100 / total);
        int pct2 =  Math.round(applicationHeight2 * 100 / total);
        int pct3 =  Math.round(applicationHeight3 * 100 / total);

        Bar bar1 = new Bar(bottom,left1,width,applicationHeight1,scale,Color.RED,"Two Heads: "+applicationHeight1+"("+pct1+"%)");
        Bar bar2 = new Bar(bottom,left2,width,applicationHeight2,scale,Color.GREEN,"A Head and a Tail: "+applicationHeight2+"("+pct2+"%)");
        Bar bar3 = new Bar(bottom,left3,width,applicationHeight3,scale,Color.BLUE,"Two Tails: "+applicationHeight3+"("+pct3+"%)");

        bar1.draw(g2);
        bar2.draw(g2);
        bar3.draw(g2);
    }
}
