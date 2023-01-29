public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word){
        String res="";
        for (int i=0;i<str.length();++i){
            if (i<str.length()-word.length()+1){
                if (str.substring(i,i+word.length()).equals(word)){
                    res += word;
                    i += word.length()-1;
                }
                else {
                    res += "+";
                }
            } else {
                res += "+";
            }
        }
        return res;
    }
}
