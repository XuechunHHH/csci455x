import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class array123 {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(input));
    }

    public static boolean array123(int[] nums){
        int[] array = {1,2,3};
        for(int i=0;i<nums.length-2;++i){
            int[] subArray = Arrays.copyOfRange(nums,i,i+3);
            if (Arrays.equals(subArray,array)){
                return true;
            }
        }
        return false;
    }
}
