public class In1To10 {
    public static void main(String[] args) {
        System.out.println(in1To10(11, true));
    }

    public static boolean in1To10(int n, boolean outsideMode){
        if (!outsideMode) return n>=1 && n<=10;
        return !(n>1 && n<10);
    }
}
