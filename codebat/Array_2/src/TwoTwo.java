public class TwoTwo {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean twoTwo(int[] nums){
        int len = nums.length;
        if (len == 0) return true;
        if (len == 1 && nums[0] == 2) return false;
        if (nums[0] == 2 && nums[1] != 2) return false;
        if (nums[len-1] == 2 && nums[len-2] != 2) return false;
        for (int i=1;i<len-1;++i){
            if (nums[i]==2 && nums[i-1] !=2 && nums[i+1] != 2) return false;
        }
        return true;
    }
}
