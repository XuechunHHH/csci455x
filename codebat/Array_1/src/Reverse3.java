public class Reverse3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        for(int i=0;i<nums.length;++i){
            System.out.println(nums[i]);
        }
    }

    public static int[] reverse3(int[] nums){
        int[] res = {nums[2],nums[1],nums[0]};
        return res;
    }
}
