public class hasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(20, 10, 13));
    }

    public static boolean hasTeen(int a, int b, int c){
        return a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19;
    }
}
