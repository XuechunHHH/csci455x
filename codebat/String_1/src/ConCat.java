public class ConCat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", ""));
    }

    public static String conCat(String a, String b){
        if (a.length() == 0 || b.length() == 0){
            return a+b;
        } else if (a.charAt(a.length()-1) == b.charAt(0)) {
            return a+b.substring(1);
        } else {
            return a+b;
        }
    }
}
