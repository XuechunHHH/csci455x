public class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str){
        if (str.length()==0) return true;
        if (str.charAt(str.length()-1)=='x') return false;
        for (int i=0;i<str.length()-1;++i){
            if(str.charAt(i)=='x'){
                for (int j=i;j<str.length();++j){
                    if (str.charAt(j)=='y') break;
                    if (j==str.length()-1) return false;
                }
            }
        }
        return true;
    }
}
