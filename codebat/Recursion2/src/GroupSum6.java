public class GroupSum6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(groupSum6(0,nums,12));
    }

    public static boolean groupSum6(int start, int[] nums, int target){
        if (start >= nums.length){
            if (target == 0) return true;
            return false;
        }

        if (nums[start] == 6) return groupSum6(start+1,nums,target-nums[start]);
        return groupSum6(start+1,nums,target) || groupSum6(start+1,nums,target-nums[start]);
    }
}
