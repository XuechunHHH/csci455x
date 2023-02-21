public class CountX {
    public static void main(String[] args) {
        System.out.println(countX("xxiewlxio"));
    }

    public static int countX(String str){
        if (str.length()==0) return 0;
        if (str.substring(0,1).equals("x")) return 1+countX(str.substring(1));
        return countX(str.substring(1));
    }
}
