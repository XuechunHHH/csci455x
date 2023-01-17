public class MiddleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("solving"));
    }

    public static String middleThree(String str){
        int half = str.length()  / 2;
        return str.substring(half-1,half+2);
    }
}
