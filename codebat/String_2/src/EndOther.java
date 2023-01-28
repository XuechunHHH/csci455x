public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("abc", "abXabc"));
    }

    public static boolean endOther(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length()==0 || b.length()==0) return true;
        if (a.length()>=b.length() && a.substring(a.length()-b.length()).equals(b)) return true;
        if (b.length()>a.length() && b.substring(b.length()-a.length()).equals(a)) return true;
        return false;
    }
}
