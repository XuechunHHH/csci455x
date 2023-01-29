public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBB"));
    }

    public static boolean xyzMiddle(String str){
        if (str.length()<3) return false;
        for (int i=0;i<str.length()-2;++i){
            if (str.substring(i,i+3).equals("xyz") && Math.abs(str.length()-i-3-i)<=1) return true;
        }
        return false;
    }
}
