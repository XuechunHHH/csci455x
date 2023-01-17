public class withouEnd2 {
    public static void main(String[] args) {
        System.out.println(withouEnd2("abc"));
    }

    public static String withouEnd2(String str){
        if (str.length() <=2 ) return "";
        return str.substring(1,str.length()-1);
    }
}
