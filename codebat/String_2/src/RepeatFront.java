public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Ice Cream", 2));
    }

    public static String repeatFront(String str, int n){
        if (n==0) return "";
        String res="";
        while (n>0){
            res += str.substring(0,n);
            n--;
        }
        return res;
    }
}
