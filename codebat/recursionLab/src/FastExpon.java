public class FastExpon {
    public static void main(String[] args) {

    }

    public static int fastExpon(int x, int n){
        if (n==0) return 1;
        if (n==1) return x;
        return fastExpon(x,n/2) * fastExpon(x,n-n/2);
    }
}
