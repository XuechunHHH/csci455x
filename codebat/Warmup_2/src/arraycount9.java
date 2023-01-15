public class arraycount9 {
    public static void main(String[] args) {
        int[] array = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(array));
    }

    public static int arrayCount9(int[] nums){
        int count = 0;
        for (int i=0;i<nums.length;++i){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
}
