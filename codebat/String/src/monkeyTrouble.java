public class monkeyTrouble {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if (aSmile && bSmile || !aSmile && !bSmile) return true;
        else return false;
    }
}
