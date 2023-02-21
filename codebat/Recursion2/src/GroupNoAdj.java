public class GroupNoAdj {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean groupNoAdj(int start, int[] nums, int target){
        if (start >= nums.length){
            if (target == 0) return true;
            return false;
        }

        return groupNoAdj(start+1,nums,target) || groupNoAdj(start+2,nums,target-nums[start]);
    }
}
