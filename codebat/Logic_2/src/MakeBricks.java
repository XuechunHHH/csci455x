public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 9));
    }

    public static boolean makeBricks(int small, int big, int goal){
        int b = Math.min(goal/5,big);
        return goal-b*5<=small;
    }
}
