public class SquirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(95, false));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer){
        if (!isSummer) return temp>=60 && temp<=90;
        return temp>=60 && temp<=100;
    }
}
