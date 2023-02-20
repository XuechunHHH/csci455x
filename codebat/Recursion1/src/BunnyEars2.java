public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int bunnyEars2(int bunnies){
        if (bunnies==0) return 0;
        if (bunnies % 2 == 1) return bunnyEars2(bunnies-1) + 2;
        return bunnyEars2(bunnies-1) + 3;
    }
}
