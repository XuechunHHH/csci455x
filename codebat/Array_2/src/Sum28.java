public class Sum28 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 2, 4, 2, 2};
        System.out.println(sum28(nums));
    }
    public static boolean sum28(int[] nums){
        int cnt = 0;
        for (int i=0;i<nums.length;++i){
            if (nums[i]==2) cnt++;
        }
        if (cnt == 4) return true;
        return false;
    }
}
