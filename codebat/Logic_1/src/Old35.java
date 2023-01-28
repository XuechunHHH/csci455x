public class Old35 {
    public static void main(String[] args) {
        System.out.println(old35(15));
    }

    public static boolean old35(int n){
        return n%3==0 && n%5!=0 || n%3!=0 && n%5==0;
    }
}
