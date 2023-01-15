public class close10 {
    public static void main(String[] args) {
        System.out.println(close10(13, 8));
    }

    public static int close10(int a, int b){
        int distance_a = Math.abs(a-10);
        int distance_b = Math.abs(b-10);
        if(distance_a == distance_b) return 0;
        else if (distance_b > distance_a) return a;
        else return b;
    }
}
