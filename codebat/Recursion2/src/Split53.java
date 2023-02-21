public class Split53 {
    public static void main(String[] args) {

    }

    public static boolean split53(int[] nums){
        return twoArray(nums,0,0,0);
    }

    public static boolean twoArray(int[] nums,int idx,int sum1,int sum2){
        if (idx >= nums.length){
            return sum1==sum2;
        }
        if (nums[idx] % 5 == 0) return twoArray(nums,idx+1,sum1+nums[idx],sum2);
        if (nums[idx] % 3 == 0) return twoArray(nums,idx+1,sum1,sum2+nums[idx]);
        return twoArray(nums,idx+1,sum1+nums[idx],sum2) || twoArray(nums,idx+1,sum1,sum2+nums[idx]);
    }
}
