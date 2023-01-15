public class mixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("pix snacks"));
    }

    public static boolean mixStart(String str){
        return (str.length()>=3 && str.substring(1,3).equals("ix"));
    }
}
