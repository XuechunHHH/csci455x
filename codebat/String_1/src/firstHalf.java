public class firstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("HelloThere"));
    }

    public static String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
}
