public class ChangePi {
    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }

    public static String changePi(String str){
        if (str.length()<=1) return str;
        if (str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.substring(0,1) + changePi(str.substring(1));
    }
}
