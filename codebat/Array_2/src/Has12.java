public class Has12 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean has12(int[] nums){
        for (int i=0;i<nums.length-1;++i){
            if (nums[i] == 1){
                for (int j=i+1;j<nums.length;++j){
                    if (nums[j] == 2) return true;
                }
            }
        }
        return false;
    }
}
