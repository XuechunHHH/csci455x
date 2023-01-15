public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str){
        if(str.length()<=1) return str;
        String ans = str.substring(0,1);
        for(int i=1;i<str.length()-1;++i){
            if(str.charAt(i) != 'x'){
                ans += str.charAt(i);
            }
        }
        ans += str.charAt(str.length()-1);
        return ans;
    }
}
