public class IsIncr {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 3, 4};
        System.out.println(IsIncr(nums));
    }

    public static boolean IsIncr(int[] nums) {
        return NextIncr(nums, 0, 1);
    }

    private static boolean NextIncr(int[] nums, int first, int next) {
        if (next >= nums.length) return true;
        if (nums[first] > nums[next]) return false;
        return NextIncr(nums, first + 1, next + 1);
    }
}
