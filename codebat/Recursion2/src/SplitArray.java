public class SplitArray {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean splitArray(int[] nums){
        return twoArray(nums,0,0,0);
    }

    public static boolean twoArray(int[] nums,int idx,int sum1,int sum2){
        if (idx >= nums.length){
            return sum1==sum2;
        }

        return twoArray(nums,idx+1,sum1+nums[idx],sum2) || twoArray(nums,idx+1,sum1,sum2+nums[idx]);
    }
}
