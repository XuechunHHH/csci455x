public class comboString {
    public static void main(String[] args) {
        System.out.println(comboString("hi", "Hello"));
    }

    public static String comboString(String a, String b){
        if (a.length()<b.length()){
            return a+b+a;
        }
        return b+a+b;
    }
}
