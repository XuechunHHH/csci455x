public class Has23 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(has23(nums));
    }

    public static boolean has23(int[] nums){
        return nums[0] == 2 || nums[0] ==3 || nums[1] == 2 || nums[1] == 3;
    }
}
