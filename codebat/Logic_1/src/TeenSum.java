public class TeenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(10, 13));
    }

    public static int teenSum(int a, int b){
        if (a>=13&&a<=19 || b>=13&&b<=19) return 19;
        return a+b;
    }
}
