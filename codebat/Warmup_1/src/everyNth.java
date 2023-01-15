public class everyNth {
    public static void main(String[] args) {
        System.out.println(everyNth("abcdefg", 3));
    }

    public static String everyNth(String str, int n){
        String ans = "";
        for (int i=0;i<str.length();i += n) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
