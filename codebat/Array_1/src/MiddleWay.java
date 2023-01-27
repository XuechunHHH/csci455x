public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] res = middleWay(a,b);
        for(int i=0;i<res.length;++i){
            System.out.println(res[i]);
        }
    }

    public static int[] middleWay(int[] a, int[] b){
        int[] res = {a[1],b[1]};
        return res;
    }
}
