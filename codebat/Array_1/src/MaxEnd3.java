public class MaxEnd3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] res = maxEnd3(nums);
        for(int i=0;i<res.length;++i){
            System.out.println(res[i]);
        }
    }

    public static int[] maxEnd3(int[] nums){
        int num = Math.max(nums[0],nums[2]);
        int[] res = {num,num,num};
        return res;
    }
}
