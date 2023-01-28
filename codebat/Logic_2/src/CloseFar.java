public class CloseFar {
    public static void main(String[] args) {
        System.out.println(closeFar(4, 1, 3));
    }

    public static boolean closeFar(int a, int b, int c){
        if(Math.abs(b-a)<=1 && Math.abs(c-a)>=2 && Math.abs(c-b)>=2 ||
                Math.abs(c-a)<=1 && Math.abs(b-a)>=2 && Math.abs(c-b)>=2) return true;
        return false;
    }
}
