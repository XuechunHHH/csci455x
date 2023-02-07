public class Has22 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(has22(arr));
    }

    public static boolean has22(int[] nums){
        for (int i=0;i<nums.length-1;++i){
            if (nums[i] == nums[i+1] && nums[i] == 2){
                return true;
            }
        }
        return false;
    }
}
