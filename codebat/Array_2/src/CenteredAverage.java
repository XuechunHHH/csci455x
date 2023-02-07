public class CenteredAverage {
    public static void main(String[] args) {
        int[] arr = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(arr));
    }

    public static int centeredAverage(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i=0;i<nums.length;++i){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            sum += nums[i];
        }
        sum = sum - max - min;
        return sum/(nums.length-2);
    }
}
