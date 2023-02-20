import java.util.ArrayList;

public class ZeroCrossings {
    public static void main(String[] args) {
        int[] arr={2,-4,-4,0,4,-5,3,0,3,-2};
        System.out.println(zeroCrossings(arr));
    }

    public static ArrayList<Double> zeroCrossings(int[] nums){
        ArrayList<Double> arr = new ArrayList<>();
        if (nums.length<=1){
            return arr;
        }
        for (int i=0;i<nums.length-2;++i){
            if(nums[i]*nums[i+1]<0){
                arr.add((i+i+1)/2.0);
            }
            if(nums[i+1]==0&&nums[i]*nums[i+2]<0){
                arr.add((i+1)/1.0);
            }
        }
        if (nums[nums.length-2]*nums[nums.length-1]<0){
            arr.add((nums.length-2+nums.length-1)/2.0);
        }
        return arr;
    }
}
