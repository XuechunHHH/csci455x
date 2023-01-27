public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(sum3(nums));
    }

    public static int sum3(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;++i){
            sum += nums[i];
        }
        return sum;
    }
}
