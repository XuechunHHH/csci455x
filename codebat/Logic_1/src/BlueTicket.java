public class BlueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(6, 1, 4));
    }

    public static int blueTicket(int a, int b, int c){
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;
        if (ab==10 || ac==10 || bc==10){
            return 10;
        } else if (Math.abs(ab-ac)==10 || Math.abs(ab-bc)==10) {
            return 5;
        }
        return 0;
    }
}
