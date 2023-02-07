public class CountEvens {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] nums){
        int cnt =0;
        for (int i=0;i<nums.length;++i){
            if (nums[i] % 2 ==0) cnt ++;
        }
        return cnt;
    }
}
