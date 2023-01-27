public class No23 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(no23(nums));
    }

    public static boolean no23(int[] nums){
        return nums[0] != 2 && nums[0] !=3 && nums[1] != 2 && nums[1] != 3;
    }
}
