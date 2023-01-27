public class MidThree {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] res = midThree(nums);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] midThree(int[] nums){
        int middle = nums.length/2;
        int[] res = {nums[middle-1],nums[middle],nums[middle+1]};
        return res;
    }
}
