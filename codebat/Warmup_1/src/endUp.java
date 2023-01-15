public class endUp {
    public static void main(String[] args) {
        System.out.println(endUp("hi there"));
    }

    public static String endUp(String str){
        if (str.length()<=3) return str.toUpperCase();
        String last = str.substring(str.length()-3).toUpperCase();
        return str.substring(0,str.length()-3) + last;
    }
}
