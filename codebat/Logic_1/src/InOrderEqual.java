public class InOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(5, 5, 7, true));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk){
        if(equalOk && b>=a && c>=b) return true;
        if(!equalOk && b>a && c>b) return true;
        return false;
    }
}
