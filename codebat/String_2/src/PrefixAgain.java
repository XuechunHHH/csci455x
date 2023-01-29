public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));
    }

    public static boolean prefixAgain(String str, int n){
        if (n==str.length()) return false;
        String sub = str.substring(0,n);
        for (int i=n;i<str.length()-n+1;++i){
            if (str.substring(i,i+n).equals(sub)) return true;
        }
        return false;
    }
}
