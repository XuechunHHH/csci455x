public class No14 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean no14(int[] nums){
        int cnt1 = 0;
        int cnt4 = 0;
        for (int i=0;i<nums.length;++i){
            if (nums[i] == 1) cnt1++;
            if (nums[i] == 4) cnt4++;
        }
        if (cnt1 == 0 || cnt4 == 0) return true;
        return false;
    }
}
