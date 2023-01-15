public class max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(19, 11));
    }

    public static int max1020(int a, int b){
        int aa = 0;
        int bb = 0;
        if (a >= 10 && a <= 20){
            aa = a;
        }
        if (b >= 10 && b <= 20){
            bb = b;
        }
        if(aa >= bb) return aa;
        return bb;
    }
}
