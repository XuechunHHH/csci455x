public class MaxMod5 {
    public static void main(String[] args) {
        System.out.println(maxMod5(3, 2));
    }

    public static int maxMod5(int a, int b){
        if (a==b) {
            return 0;
        } else if (a%5==b%5) {
            return Math.min(a,b);
        }
        return Math.max(a,b);
    }
}
