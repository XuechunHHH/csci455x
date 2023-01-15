public class stringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));
    }

    public static String stringTimes(String str, int n){
        String ans = "";
        for (int i=0;i<n;++i){
            ans += str;
        }
        return ans;
    }
}
