public class PlusTwo {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {4,5};
        int[] res = plusTwo(a,b);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] plusTwo(int[] a, int[] b){
        int[] res = {a[0],a[1],b[0],b[1]};
        return res;
    }
}
