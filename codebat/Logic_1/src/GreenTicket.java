public class GreenTicket {
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 1, 2));
    }

    public static int greenTicket(int a, int b, int c){
        if (a==b && b==c){
            return 20;
        } else if (a!=b && a!=c && b!=c) {
            return 0;
        }
        return 10;
    }
}
