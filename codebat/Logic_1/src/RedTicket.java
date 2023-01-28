public class RedTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 1));
    }

    public static int redTicket(int a, int b, int c){
        if (a==b && b==c){
            if(a==2){
                return 10;
            }
            return 5;
        } else if (a!=b && a!=c) {
            return 1;
        }
        return 0;
    }
}
