public class TeaParty {
    public static void main(String[] args) {
        System.out.println(teaParty(3, 8));
    }

    public static int teaParty(int tea, int candy){
        int score = 0;
        if(tea>=5&&candy>=5){
            score = 1;
            if(tea>=2*candy||candy>=2*tea){
                score = 2;
            }
        }
        return score;
    }
}
