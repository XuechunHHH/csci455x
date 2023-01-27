public class Make2 {
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {4,5,6};
        int[] res = make2(a,b);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] make2(int[] a, int[] b){
        int[] res = new int[2];
        if (a.length == 0 ){
            res[0] = b[0];
            res[1] = b[1];
        } else if (a.length == 1) {
            res[0] = a[0];
            res[1] = b[0];
        } else {
            res[0] = a[0];
            res[1] = a[1];
        }
        return res;
    }
}
