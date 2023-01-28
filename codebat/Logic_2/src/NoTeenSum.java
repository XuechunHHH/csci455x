public class NoTeenSum {
    public static void main(String[] args) {
        System.out.println(noTeenSum(2, 1, 14));
    }

    public static int noTeenSum(int a, int b, int c){
        return a*fixTeen(a)+b*fixTeen(b)+c*fixTeen(c);
    }

    public static int fixTeen(int n){
        if (n>=13&&n<=19&&n!=15&&n!=16){
            return 0;
        }
        return 1;
    }
}
