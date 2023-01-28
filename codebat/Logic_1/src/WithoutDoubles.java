public class WithoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(3, 3, true));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles){
        if (die1 == die2 && noDoubles) {
            if(die1==6) {
                return die1 + 1;
            }
            return die1+die2+1;
        }
        return die1+die2;
    }
}
