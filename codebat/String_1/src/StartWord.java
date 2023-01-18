public class StartWord {
    public static void main(String[] args) {
        System.out.println(startWord("hippo", "i"));
    }

    public static String startWord(String str, String word){
        if (str.length() < word.length()) return "";
        if (word.length() == 1) return str.substring(0,1);
        if (word.substring(1).equals(str.substring(1,word.length()))) return str.substring(0,word.length());
        return "";
    }
}
