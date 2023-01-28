public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(4, 6, 2));
    }

    public static boolean evenlySpaced(int a, int b, int c){
        if (a==b&&a!=c ||a==c&&a!=b ||b==c&&b!=a) return false;
        if (Math.abs(a-b) == Math.abs(a-c) || Math.abs(a-b) == Math.abs(b-c) ||Math.abs(c-b) == Math.abs(a-c))
            return true;
        return false;
    }
}
