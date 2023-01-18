public class MinCat {
    public static void main(String[] args) {
        System.out.println(minCat("HelloHxc", "Hi"));
    }

    public static String minCat(String a, String b){
        if(a.length() == b.length()){
            return a+b;
        } else if (a.length() < b.length()) {
            return a+b.substring(b.length()-a.length());
        } else {
            return a.substring(a.length()-b.length())+b;
        }
    }
}
