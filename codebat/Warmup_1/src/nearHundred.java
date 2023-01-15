public class nearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(90));
    }

    public static boolean nearHundred(int n){
        return Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10;
    }
}
