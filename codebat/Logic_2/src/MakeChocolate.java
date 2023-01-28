public class MakeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 10));
    }

    public static int makeChocolate(int small, int big, int goal){
        int b = Math.min(goal/5,big);
        if (goal-b*5>small) return -1;
        return goal-b*5;
    }
}
