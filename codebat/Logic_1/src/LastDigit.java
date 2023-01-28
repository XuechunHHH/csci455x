public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 12));
    }

    public static boolean lastDigit(int a, int b, int c){
        if (a%10==b%10 || a%10==c%10 || b%10==c%10) return true;
        return false;
    }
}
