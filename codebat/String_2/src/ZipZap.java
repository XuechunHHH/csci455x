public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        if (str.length()<3) return str;
        for (int i=0;i<str.length()-2;++i){
            if (str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                str = str.substring(0,i+1)+str.substring(i+2);
            }
        }
        return str;
    }
}
