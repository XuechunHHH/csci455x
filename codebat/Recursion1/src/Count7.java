public class Count7 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int count7(int n){
        if(n==7) return 1;
        if(n<10 && n!=7) return 0;
        if (n%10==7) return count7(n/10) + 1;
        return count7(n/10);
    }
}
