public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 2));
    }

    public static String repeatEnd(String str, int n){
        if(n==0) return "";
        String res ="";
        String sub = str.substring(str.length()-n);
        for (int i=0;i<n;++i){
            res += sub;
        }
        return res;
    }
}
