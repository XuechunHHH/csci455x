public class endsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str){
        if (str.length() < 2) {
            return false;
        } else if (str.substring(str.length()-2).equals("ly")) {
            return true;
        }
        return false;
    }
}
