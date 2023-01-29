public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word){
        if (str.length()<word.length()) return "";
        String res ="";
        for (int i=0;i<str.length()-word.length()+1;++i){
            if (i==0 && str.substring(i,i+word.length()).equals(word) && i<str.length()-word.length()){
                res += str.substring(i+word.length(),i+word.length()+1);
            }else if (i>0 && str.substring(i,i+word.length()).equals(word)){
                if (i<str.length()-word.length()){
                    res += str.substring(i-1,i)+str.substring(i+word.length(),i+word.length()+1);
                }else {
                    res += str.substring(i-1,i);
                }
            }
        }
        return res;
    }
}
