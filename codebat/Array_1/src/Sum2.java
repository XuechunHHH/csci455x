public class Sum2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(sum2(nums));
    }

    public static int sum2(int[] nums){
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return nums[0]+nums[1];
    }
}
