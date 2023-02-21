public class AllStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }

    public static String allStar(String str){
        if (str.length()<=1) return str;
        return str.substring(0,1)+"*"+allStar(str.substring(1));
    }
}
