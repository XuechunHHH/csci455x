public class DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("away"));
    }

    public static String deFront(String str){
        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1 && str.equals("a") ) {
            return str;
        } else if (str.length() == 1){
            return "";
        }
        String first = "a";
        String second = "b";
        if (!str.substring(0,1).equals(first)){
            first = "";
        }
        if (!str.substring(1,2).equals(second)){
            second = "";
        }
        return first+second+str.substring(2);
    }
}
