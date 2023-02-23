public class Has77 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean has77(int[] nums){
        for (int i=0;i<nums.length-2;++i){
            if (nums[i]==7 && nums[i+1]==7 || nums[i]==7 && nums[i+2]==7) return true;
        }
        if (nums.length>=2){
            int len = nums.length;
            if (nums[len-2] == 7 && nums[len-1] ==7){
                return true;
            }
        }
        return false;
    }
}
