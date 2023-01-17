public class HasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("xxbadxx"));
    }

    public static boolean hasBad(String str){
        if (str.length() < 3) {
            return false;
        } else if (str.substring(0,3).equals("bad")) {
            return true;
        } else if (str.length() >=4 && str.substring(1,4).equals("bad")){
            return true;
        }
        return false;
    }
}
