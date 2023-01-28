public class Love6 {
    public static void main(String[] args) {
        System.out.println(love6(1, 5));
    }

    public static boolean love6(int a, int b){
        return a==6 || b==6 || a+b==6 ||Math.abs(a-b)==6;
    }
}
