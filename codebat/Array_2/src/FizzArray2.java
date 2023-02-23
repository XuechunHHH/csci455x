public class FizzArray2 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static String[] fizzArray2(int n){
        String[] res = new String[n];
        for (int i=0;i<n;++i){
            res[i] = ""+i;
        }
        return res;
    }
}
