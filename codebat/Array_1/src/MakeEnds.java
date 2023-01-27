public class MakeEnds {
    public static void main(String[] args) {
        int[] nums = {4,5,6};
        int[] res = makeEnds(nums);
        for(int i=0;i<res.length;++i){
            System.out.println(res[i]);
        }
    }

    public static int[] makeEnds(int[] nums){
        int[] res = {nums[0],nums[nums.length-1]};
        return res;
    }
}
