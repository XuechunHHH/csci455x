public class LoneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(3, 2, 3));
    }

    public static int loneSum(int a, int b, int c){
        int aExist = 1;
        int bExist = 1;
        int cExist = 1;
        if (a==b) {
            aExist = 0;
            bExist = 0;
        }
        if (a==c) {
            aExist = 0;
            cExist = 0;
        }
        if (c==b) {
            bExist = 0;
            cExist = 0;
        }
        return a*aExist+b*bExist+c*cExist;
    }
}
