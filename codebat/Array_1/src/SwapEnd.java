public class SwapEnd {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] res = swapEnds(nums);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] swapEnds(int[] nums){
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }
}
