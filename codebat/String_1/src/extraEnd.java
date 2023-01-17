public class extraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }

    public static String extraEnd(String str){
        String substr = str.substring(str.length()-2);
        return substr+substr+substr;
    }
}
