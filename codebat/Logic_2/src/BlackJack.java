public class BlackJack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b){
        if (a>21 && b>21) return 0;
        else if (a>21) return b;
        else if (b>21) return a;
        return 21-a>=21-b ? b:a;
    }
}
