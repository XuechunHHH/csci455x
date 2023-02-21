public class SplitOdd10 {
    public static void main(String[] args) {

    }

    public static boolean splitOdd10(int[] nums){
        return twoArray(nums,0,0,0);
    }

    public static boolean twoArray(int[] nums,int idx,int sum1,int sum2){
        if (idx >= nums.length){
            return sum1 % 10 == 0 && sum2 % 2 == 1 || sum2 % 10 == 0 && sum1 % 2 == 1;
        }

        return twoArray(nums,idx+1,sum1+nums[idx],sum2) || twoArray(nums,idx+1,sum1,sum2+nums[idx]);
    }
}
