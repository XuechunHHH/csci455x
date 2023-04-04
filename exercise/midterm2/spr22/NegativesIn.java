import java.util.LinkedList;

public class NegativesIn {
    public static void main(String[] args) {
        int[] nums = {-7,3,-12,-7,4};
        System.out.println(negativesIn(nums).toString());;
    }

    public static LinkedList<Integer> negativesIn(int[] nums){
        LinkedList<Integer> list = new LinkedList<>();
        return rec(nums,list,0);
    }

    private static LinkedList<Integer> rec(int[] nums,LinkedList<Integer> list,int pos){
        if(pos == nums.length){return list;}
        if (nums[pos]<0){list.add(nums[pos]);}
        return rec(nums,list,pos+1);
    }
}
