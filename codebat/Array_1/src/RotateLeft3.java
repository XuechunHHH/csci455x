public class RotateLeft3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(rotateLeft3(nums));
    }

    public static int[] rotateLeft3(int[] nums){
        int[] res = {nums[1],nums[2],nums[0]};
        return res;
    }
}
