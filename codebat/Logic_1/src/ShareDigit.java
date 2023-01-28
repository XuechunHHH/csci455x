public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 44));
    }

    public static boolean shareDigit(int a, int b){
        int aLeft = a/10;
        int aRight = a%10;
        int bLeft = b/10;
        int bRight = b%10;
        if(aLeft==bLeft||aLeft==bRight||aRight==bLeft||aRight==bRight) return true;
        return false;
    }
}
