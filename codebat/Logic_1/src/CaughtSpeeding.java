public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(65, false));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday){
        if (!isBirthday){
            if (speed>=81) return 2;
            else if (speed>=61) return 1;
            return 0;
        }
        if (speed>=86) return 2;
        else if (speed>=66) return 1;
        return 0;
    }
}
