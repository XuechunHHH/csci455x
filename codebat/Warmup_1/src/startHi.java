public class startHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }

    public static boolean startHi(String str){
        if (str.length()>=2 && str.substring(0,2).equals("hi")) return true;
        return false;
    }
}
