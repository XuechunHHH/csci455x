public class FizzArray {
    public static void main(String[] args) {

    }

    public static int[] fizzArray(int n){
        int[] arr = new int[n];
        for (int i=0;i<n;++i){
            arr[i] = i;
        }
        return arr;
    }
}
