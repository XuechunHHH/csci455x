import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] myNums = {5,10,15,20};
        grow(myNums);
        System.out.println(myNums.length);
    }

    public static void grow(int[] nums){
        int[] bigger = Arrays.copyOf(nums,nums.length*2);
        nums = bigger;
    }
}
