public class has271 {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 1};
        System.out.println(has271(array));
    }

    public static boolean has271(int[] nums){
        for (int i=0;i<nums.length-2;++i){
            if(nums[i] + 5 == nums[i+1] && Math.abs(nums[i] - 1 - nums[i+2]) <=2 ){
                return true;
            }
        }
        return false;
    }
}
