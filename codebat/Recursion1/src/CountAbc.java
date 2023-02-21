public class CountAbc {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int countAbc(String str){
        if (str.length()<3) return 0;
        if (str.substring(0,3).equals("abc")) return 1+countAbc(str.substring(3));
        if (str.substring(0,3).equals("aba")) return 1+countAbc(str.substring(2));
        return countAbc(str.substring(1));
    }
}
