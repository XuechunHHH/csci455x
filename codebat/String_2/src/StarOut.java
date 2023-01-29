public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("a"));
    }

    public static String starOut(String str){
        String res = "";
        for (int i=0;i<str.length();++i){
            if (i==0 && str.charAt(i) != '*'){
                res += str.charAt(i);
            } else if (i>0 && str.charAt(i) != '*' && str.charAt(i-1) != '*') {
                res += str.charAt(i);
            } else if (i>0 && str.charAt(i) == '*' && str.charAt(i-1) !='*') {
                res = res.substring(0,res.length()-1);
            }
        }
        return res;
    }
}
