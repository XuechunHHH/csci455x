// Name:
// USC NetID:
// CS 455 PA1
// Spring 2023

import java.util.Random;

/**
 * class CoinTossSimulator
 *
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 *
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants,
 * and private methods to the class.  You will also be completing the
 * implementation of the methods given.
 *
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 *
 */
public class CoinTossSimulator {

    private int numTrials;
    private int twoHeads;
    private int headTails;
    private int twoTails;

    /**
     Creates a coin toss simulator with no trials done yet.
     */

    // CoinTossSimulator constructor
    public CoinTossSimulator() {

    }


    /**
     Runs the simulation for numTrials more trials. Multiple calls to this method
     without a reset() between them *add* these trials to the current simulation.

     @param numTrials  number of trials to for simulation; must be >= 1
     */

    // toss the coin for numTrials times
    public void run(int numTrials) {
        this.numTrials +=numTrials;
        for(int i=0;i<numTrials;++i){
            Random ran = new Random();
            int coin1 = ran.nextInt(2);   // 0 is Head and 1 is Tail
            int coin2 = ran.nextInt(2);
            if (coin1 == 0 && coin2 == 0){
                ++twoHeads;  // calculate the results
            } else if (coin1 == 1 && coin2 == 1) {
                ++twoTails;
            } else {
                ++headTails;
            }
        }
    }


    /**
     Get number of trials performed since last reset.
     */
    // get the trial times
    public int getNumTrials() {
        return numTrials; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
     Get number of trials that came up two heads since last reset.
     */

    // get the TwoHeads number
    public int getTwoHeads() {
        return twoHeads; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
     Get number of trials that came up two tails since last reset.
     */
    // get the TwoTails number
    public int getTwoTails() {
        return twoTails; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
     Get number of trials that came up one head and one tail since last reset.
     */
    // get the number of one Head and One Tail
    public int getHeadTails() {
        return headTails; // DUMMY CODE TO GET IT TO COMPILE
    }


    /**
     Resets the simulation, so that subsequent runs start from 0 trials done.
     */

    // reset the number of trial to zero
    public void reset() {
        numTrials = 0;
        twoHeads = 0;
        headTails = 0;
        twoTails = 0;
    }

}

