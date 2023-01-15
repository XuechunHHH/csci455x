public class array667 {
    public static void main(String[] args) {
        int[] array = {6, 7, 2, 6};
        System.out.println(array667(array));
    }

    public static int array667(int[] nums){
        int count = 0;
        for (int i=0;i<nums.length-1;++i){
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)){
                count ++;
            }
        }
        return count;
    }
}
