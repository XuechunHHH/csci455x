public class Without2 {
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
    }

    public static String without2(String str){
        if (str.length() < 2) return str;
        if (str.length() == 2) return "";
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }else{
            return str;
        }
    }
}
