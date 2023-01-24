public class CoinTossSimulatorTester {
    public static void main(String[] args) {
        CoinTossSimulator toss = new CoinTossSimulator();
        boolean correct = false;
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(1);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(10);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(100);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);

        toss.reset();

        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);

        toss.run(1000);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
        correct = toss.getNumTrials() == (toss.getTwoTails() + toss.getHeadTails() + toss.getTwoHeads());
        System.out.println("Tosses add up correctly? "+ correct);
    }
}
