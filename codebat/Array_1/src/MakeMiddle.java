public class MakeMiddle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = makeMiddle(nums);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] makeMiddle(int[] nums){
        int second = nums.length/2;
        int[] res = {nums[second-1],nums[second]};
        return res;
    }
}
