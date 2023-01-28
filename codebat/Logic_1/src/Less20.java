public class Less20 {
    public static void main(String[] args) {
        System.out.println(less20(20));
    }

    public static boolean less20(int n){
        return n%20==19 || n%20==18;
    }
}
