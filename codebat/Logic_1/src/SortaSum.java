public class SortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(10, 11));
    }

    public static int sortaSum(int a, int b){
        int sum = a+b;
        if(sum >=10 && sum<=19) return 20;
        return sum;
    }
}
