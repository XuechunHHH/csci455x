public class Strdist {
    public static void main(String[] args) {
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    public static int strDist(String str, String sub){
        int strlen = str.length();
        int sublen = sub.length();
        if (strlen<sublen) return 0;
        if (str.substring(0,sublen).equals(sub) && str.substring(strlen-sublen).equals(sub)) return strlen;
        if (!str.substring(0,sublen).equals(sub)) return strDist(str.substring(1),sub);
        return strDist(str.substring(0,strlen-1),sub);
    }
}
