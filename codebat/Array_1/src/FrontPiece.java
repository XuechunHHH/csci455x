public class FrontPiece {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] res = frontPiece(nums);
        String out = "["+res[0];
        for (int i=1;i<res.length;++i){
            out +=","+res[i];
        }
        out +="]";
        System.out.println(out);
    }

    public static int[] frontPiece(int[] nums){
        if(nums.length<2) return nums;
        int[] res = new int[]{nums[0], nums[1]};
        return res;
    }
}
