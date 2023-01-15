public class posNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(-4, -5, true));
    }

    public static boolean posNeg(int a, int b, boolean negative){
        return negative && a<0 && b<0 || !negative && a*b<0;
    }
}
