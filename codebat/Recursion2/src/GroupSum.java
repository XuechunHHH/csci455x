public class GroupSum {
    public static void main(String[] args) {
        int [] nums= {12,3,4,5};
        System.out.println(groupSum(0,nums,7));
    }

    public static boolean groupSum(int start, int[] nums, int target){
        if (start >= nums.length){
            if (target == 0) return true;
            else return false;
        }
        return groupSum(start+1,nums,target-nums[start]) || groupSum(start+1,nums,target);
    }
}
