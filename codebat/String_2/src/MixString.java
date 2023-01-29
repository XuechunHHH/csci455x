public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String a, String b){
        String res="";
        if(a.length()<=b.length()){
            for(int i=0;i<a.length();++i){
                res += a.substring(i,i+1)+b.substring(i,i+1);
            }
            res += b.substring(a.length());
        } else if (a.length()>b.length()) {
            for(int i=0;i<b.length();++i){
                res += a.substring(i,i+1)+b.substring(i,i+1);
            }
            res += a.substring(b.length());
        }
        return res;
    }
}
