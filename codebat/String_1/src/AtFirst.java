public class AtFirst {
    public static void main(String[] args) {
        System.out.println(atFirst("h"));
    }

    public static String atFirst(String str){
        if (str.length() == 0) {
            return "@@";
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return str.substring(0,2);
        }
    }
}
