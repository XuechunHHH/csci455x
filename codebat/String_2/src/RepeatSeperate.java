public class RepeatSeperate {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String word, String sep, int count){
        if(count==0) return "";
        String res=word;
        while(count>1){
            res += sep+word;
            count--;
        }
        return res;
    }
}
