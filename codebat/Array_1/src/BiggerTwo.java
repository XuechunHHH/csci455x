public class BiggerTwo {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {2,3};
        System.out.println(biggerTwo(a,b));
    }

    public static int[] biggerTwo(int[] a, int[] b){
        int sumA = a[0]+a[1];
        int sumB = b[0]+b[1];
        return sumA >= sumB ? a:b;
    }
}
