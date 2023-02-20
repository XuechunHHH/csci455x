public class Count8 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int count8(int n){
        if (n==8) return 1;
        else if (n<10) return 0;
        else if (n%100==88) return count8(n/10)+2;
        else if (n%10==8) return count8(n/10)+1;
        return count8(n/10);
    }
}
