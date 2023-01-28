public class TwoAsOne {
    public static void main(String[] args) {
        System.out.println(twoAsOne(3, 1, 2));
    }

    public static boolean twoAsOne(int a, int b, int c){
        if (a+b==c || a+c==b || b+c==a) return true;
        return false;
    }
}
