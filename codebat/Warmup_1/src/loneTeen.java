public class loneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 13));
    }

    public static boolean loneTeen(int a, int b){
        boolean teena = a>=13 &&a<=19;
        boolean teenb = b>=13 &&b<=19;
        return teena && !teenb || !teena && teenb;
    }
}
