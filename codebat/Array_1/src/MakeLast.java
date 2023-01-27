public class MakeLast {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] res = makeLast(nums);
        for(int i=0;i<res.length;++i){
            System.out.println(res[i]);
        }
    }

    public static int[] makeLast(int[] nums){
        int[] res = new int[nums.length*2];
        res[nums.length*2-1] = nums[nums.length-1];
        return res;
    }
}
