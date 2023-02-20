public class PowerN {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int powerN(int base, int n){
        if (n==0) return 1;
        return base*powerN(base,n-1);
    }
}
