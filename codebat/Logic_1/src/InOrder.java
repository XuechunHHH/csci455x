public class InOrder {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 1, false));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk){
        if(bOk && c>b) return true;
        if(!bOk && b>a && c>b) return true;
        return false;
    }
}
