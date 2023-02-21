public class CountHi2 {
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
    }

    public static int countHi2(String str){
        if (str.length()<2) return 0;
        if (str.substring(0,1).equals("x") && str.length()>=3 && str.substring(1,3).equals("hi")) return countHi2(str.substring(3));
        if (str.substring(0,2).equals("hi")) return 1+countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }
}
