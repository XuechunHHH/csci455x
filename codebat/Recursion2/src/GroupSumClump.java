public class GroupSumClump {
    public static void main(String[] args) {

    }

    public static boolean groupSumClump(int start, int[] nums, int target){
        if (start >= nums.length){
            if (target == 0) return true;
            else return false;
        }
        int idx = start;
        while( idx+1<nums.length && nums[idx+1] == nums[idx]){
            idx++;
        }
        int sum = (idx-start+1)*nums[start];
        return groupSumClump(idx+1,nums,target-sum) || groupSumClump(idx+1,nums,target);
    }
}
