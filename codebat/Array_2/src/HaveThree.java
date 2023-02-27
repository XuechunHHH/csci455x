public class HaveThree {
    public static void main(String[] args) {

    }

    public static boolean haveThree(int[] nums){
        int cnt = 0;
        for (int i=0;i<nums.length-1;++i){
            if (nums[i]==3){
                cnt++;
                if (nums[i+1]==3){
                    return false;
                }
            }
        }
        if (nums.length-1>=0 && nums[nums.length-1]==3) cnt++;
        if (cnt != 3) return false;
        return true;
    }
}
