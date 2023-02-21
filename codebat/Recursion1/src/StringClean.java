public class StringClean {
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
    }

    public static String stringClean(String str){
        if (str.length()<2) return str;
        if (str.substring(0,1).equals(str.substring(1,2))) return stringClean(str.substring(1));
        return str.substring(0,1)+stringClean(str.substring(1));
    }
}
