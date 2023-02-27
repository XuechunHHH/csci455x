import java.util.Scanner;

public class longestWordLen {
    public static void main(String[] args) {

    }

    public static int longestWordLen(String words) {
        Scanner in = new Scanner(words);
        int longest = longestLen(in,0);
        return longest;
    }

    public static int longestLen(Scanner in,int maxLen){
        if (!in.hasNext()) return maxLen;
        String next = in.next();
        if (next.length() > maxLen){
            return longestLen(in,next.length());
        }
        return longestLen(in,maxLen);
    }
}
