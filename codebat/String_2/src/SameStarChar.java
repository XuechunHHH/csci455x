public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("*xa*az"));
    }

    public static boolean sameStarChar(String str){
        if (str.length()==0) return true;
        for (int i=1;i<str.length()-1;++i){
            if (str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) return false;
        }
        return true;
    }
}
