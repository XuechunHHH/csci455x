public class StringCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
    }

    public static int strCount(String str, String sub){
        int strlen=str.length();
        int sublen=sub.length();
        if (strlen<sublen) return 0;
        if (str.substring(0,sublen).equals(sub)) return 1+strCount(str.substring(sublen),sub);
        return strCount(str.substring(1),sub);
    }
}
