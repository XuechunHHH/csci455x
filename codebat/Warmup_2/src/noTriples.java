public class noTriples {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 2, 1};
        System.out.println(noTriples(array));
    }

    public static boolean noTriples(int[] nums){
        for(int i=0;i<nums.length-2;++i){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
}
