public class MasTriple {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,4};
        System.out.println(maxTriple(nums));
    }

    public static int maxTriple(int[] nums){
        int mid = nums.length/2;
        int max = Math.max(nums[0],nums[mid]);
        max = Math.max(nums[nums.length-1],max);
        return max;
    }
}
