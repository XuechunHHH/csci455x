public class WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("Hxi"));
    }

    public static String withoutX2(String str){
        if (str.length() < 1 || str.equals("x") || str.equals("xx")) return "";
        if (!str.substring(0,1).equals("x") && str.substring(1,2).equals("x")){
            str = str.substring(0,1)+str.substring(2);
        }
        if (str.substring(0,1).equals("x") && !str.substring(1,2).equals("x")) str = str.substring(1);
        if (str.substring(0,2).equals("xx")) str = str.substring(2);
        return str;
    }
}
