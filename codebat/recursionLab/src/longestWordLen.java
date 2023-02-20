import java.util.Arrays;

public class longestWordLen {
    public static void main(String[] args) {

    }

    public static int longestWordLen(String words) {
        String[] arr = words.split(" ");
        int longest = longestLen(arr);
        return longest;
    }

    public static int longestLen(String[] arr){
        int len = arr.length;
        if (len==1) return arr[0].length();

        String[] left = Arrays.copyOfRange(arr,0,len/2);
        String[] right = Arrays.copyOfRange(arr,len/2,len);

        if (longestLen(left) >= longestLen(right)){
            return longestLen(left);
        }else{
            return longestLen(right);
        }
    }
}
