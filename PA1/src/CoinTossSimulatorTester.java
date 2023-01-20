public class CoinTossSimulatorTester {
    public static void main(String[] args) {
        CoinTossSimulator toss = new CoinTossSimulator();
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());

        toss.run(1);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());

        toss.run(10);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());

        toss.run(100);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());

        toss.reset();

        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());

        toss.run(1000);
        System.out.println("NumTrials: "+toss.getNumTrials());
        System.out.println("TwoHeads: "+toss.getTwoHeads());
        System.out.println("HeadTails: "+toss.getHeadTails());
        System.out.println("TwoTails: "+toss.getTwoTails());
    }
}
