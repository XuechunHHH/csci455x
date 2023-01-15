public class missingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 4));
    }

    public static String missingChar(String str, int n){
        if (n==0) return str.substring(1);
        if (n==str.length()-1) return str.substring(0,n);
        return str.substring(0,n)+str.substring(n+1);
    }
}
