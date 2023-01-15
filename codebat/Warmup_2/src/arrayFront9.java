public class arrayFront9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9};
        System.out.println(arrayFront9(array));
    }

    public static boolean arrayFront9(int[] nums){
        int max = 4;
        if(nums.length<4){
            max = nums.length;
        }
        for(int i=0;i<max;++i){
            if(nums[i] == 9) return true;
        }
        return false;
    }
}
