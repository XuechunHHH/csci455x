public class LessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(11, 1, 7));
    }

    public static boolean lessBy10(int a, int b, int c){
        return Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(c-b)>=10;
    }
}
