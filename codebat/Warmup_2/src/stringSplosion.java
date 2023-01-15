public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }

    public static String stringSplosion(String str){
        String ans = "";
        for(int i=1;i<=str.length();++i){
            ans += str.substring(0,i);
        }
        return ans;
    }
}
