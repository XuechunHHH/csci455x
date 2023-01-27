public class CommandEnd {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {7,3};
        System.out.println(commonEnd(a,b));
    }

    public static boolean commonEnd(int[] a, int[] b){
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
}
