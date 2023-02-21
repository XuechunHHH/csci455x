public class EndX {
    public static void main(String[] args) {
        System.out.println(endX("xkjlwxewxe"));
    }

    public static String endX(String str){
        if (str.length()<1) return str;
        if (str.substring(0,1).equals("x")) return endX(str.substring(1))+"x";
        return str.substring(0,1)+endX(str.substring(1));
    }
}
