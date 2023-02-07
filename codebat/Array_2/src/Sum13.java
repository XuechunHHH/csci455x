public class Sum13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 13,16};
        System.out.println(sum13(arr));
    }

    public static int sum13(int[] nums){
        int len = nums.length;
        if (len == 0 ) return 0;
        int sum=0;
        for (int i=0;i<len;++i){
            if (nums[i] == 13 && i!=len-1){
                ++i;
                continue;
            } else if (nums[i] == 13) {
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}
