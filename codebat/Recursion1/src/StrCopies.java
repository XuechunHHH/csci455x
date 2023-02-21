public class StrCopies {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean strCopies(String str, String sub, int n){
        if (n<=strCount(str,sub)) return true;
        return false;
    }

    public static int strCount(String str, String sub){
        int strlen=str.length();
        int sublen=sub.length();
        if (strlen<sublen) return 0;
        if (str.substring(0,sublen).equals(sub)) return 1+strCount(str.substring(1),sub);
        return strCount(str.substring(1),sub);
    }
}
