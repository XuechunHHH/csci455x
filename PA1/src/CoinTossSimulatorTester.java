public class CoinTossSimulatorTester {
    public static void main(String[] args) {
        CoinTossSimulator toss = new CoinTossSimulator();
        boolean correct = false;
        // record the trials in another way
        int trials = 0;
        System.out.println("Number of trials [exp:0]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(1);
        trials += 1;
        System.out.println("Number of trials [exp:1]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(10);
        trials += 10;
        System.out.println("Number of trials [exp:11]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(100);
        trials += 100;
        System.out.println("Number of trials [exp:111]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(300);
        trials += 300;
        System.out.println("Number of trials [exp:411]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.reset();
        trials = 0;
        System.out.println("Number of trials [exp:0]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(1000);
        trials += 1000;
        System.out.println("Number of trials [exp:1000]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(2000);
        trials += 2000;
        System.out.println("Number of trials [exp:3000]: "+trials);
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = trials == toss.getNumTrials();
        System.out.println("Tosses add up correctly? "+ correct);
    }
}
