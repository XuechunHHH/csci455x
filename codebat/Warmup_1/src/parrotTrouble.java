public class parrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 7));
    }

    public static boolean parrotTrouble(boolean talking, int hour){
        return talking && (hour < 7 || hour > 20);
    }
}
