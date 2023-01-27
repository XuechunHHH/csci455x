public class Front11 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        int[] res = front11(a,b);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] front11(int[] a, int[] b){
        if (a.length == 0 && b.length == 0){
            int[] res = new int[0];
            return res;
        }
        if (a.length == 0){
            int[] res = {b[0]};
            return res;
        }
        if (b.length == 0){
            int[] res = {a[0]};
            return res;
        }
        int[] res = {a[0],b[0]};
        return res;
    }
}
