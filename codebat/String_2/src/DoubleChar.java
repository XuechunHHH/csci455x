public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("Hi-There"));
    }

    public static String doubleChar(String str){
        String res="";
        for (int i=0;i<str.length();++i){
            res += str.substring(i,i+1) + str.substring(i,i+1);
        }
        return res;
    }
}
