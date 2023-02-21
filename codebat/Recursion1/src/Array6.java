public class Array6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(array6(nums,0));
    }

    public static boolean array6(int[] nums, int index){
        if(nums.length < (index+1)) return false;
        if (nums[index]==6) return true;
        return array6(nums,index+1);
    }
}
