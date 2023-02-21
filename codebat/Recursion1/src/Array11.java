public class Array11 {
    public static void main(String[] args) {
        int[] nums = {11,3,4,5,1,11,4,5};
        System.out.println(array11(nums,0));
    }

    public static int array11(int[] nums, int index){
        if (nums.length < index+1) return 0;
        if (nums[index] == 11) return 1+array11(nums,index+1);
        return array11(nums,index+1);
    }
}
