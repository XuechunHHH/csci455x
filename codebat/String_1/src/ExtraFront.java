public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
    }

    public static String extraFront(String str){
        if (str.length() <= 2) {
            return str+str+str;
        }else{
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
    }
}
