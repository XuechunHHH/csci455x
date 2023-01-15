public class in3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
    }

    public static boolean in3050(int a, int b){
        return a >= 30 && a <= 40 && b>=30 && b<=40 || a >= 40 && a <= 50 && b>=40 && b<=50;
    }
}
