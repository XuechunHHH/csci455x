public class NoX {
    public static void main(String[] args) {
        System.out.println(noX("xiueohslgxouwetohsnxxxx"));
    }

    public static String noX(String str){
        if (str.length()==0) return str;
        if (str.substring(0,1).equals("x")) return noX(str.substring(1));
        return str.substring(0,1)+noX(str.substring(1));
    }
}
