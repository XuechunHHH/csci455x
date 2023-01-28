public class AlarmClock {
    public static void main(String[] args) {
        System.out.println(alarmClock(0, false));
    }

    public static String alarmClock(int day, boolean vacation){
        if(!vacation){
            if (day>=1 && day<=5) return "7:00";
            return "10:00";
        }
        if (day>=1 && day<=5) return "10:00";
        return "off";
    }
}
