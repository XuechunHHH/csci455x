public class WithoutX {
    public static void main(String[] args) {
        System.out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str){
        if (str.length() < 1 || str.equals("x")) return "";
        if (str.substring(0,1).equals("x")){
            str = str.substring(1);
        }
        if (str.substring(str.length()-1).equals("x")){
            str = str.substring(0,str.length()-1);
        }
        return str;
    }
}
