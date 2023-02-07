public class Sum67 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 99, 99, 7, 8};
        System.out.println(sum67(arr));
    }

    public static int sum67(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;++i){
            if (nums[i] == 6){
                for (int j=i+1;j<nums.length;++j){
                    if (nums[j] == 7){
                        i = j;
                        break;
                    }
                }
            }else {
                sum += nums[i];
            }
        }
        return sum;
    }
}
