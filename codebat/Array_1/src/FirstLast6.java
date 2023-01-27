public class FirstLast6 {
    public static void main(String[] args) {
        int[] nums = {1,2,6};
        System.out.println(firstLast6(nums));
    }

    public static boolean firstLast6(int[] nums){
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }
}
