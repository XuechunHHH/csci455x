public class GroupSum5 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean groupSum5(int start, int[] nums, int target){
        if (start >= nums.length){
            if (target == 0) return true;
            return false;
        }

        if (nums[start] % 5 == 0 && start+1<nums.length && nums[start+1] != 1) return groupSum5(start+1,nums,target-nums[start]);
        if (nums[start] % 5 == 0 && start+1<nums.length && nums[start+1] == 1) return groupSum5(start+2,nums,target-nums[start]);
        return groupSum5(start+1,nums,target) || groupSum5(start+1,nums,target-nums[start]);
    }
}
