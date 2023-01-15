public class startOz {
    public static void main(String[] args) {
        System.out.println(startOz("oxx"));
    }

    public static String startOz(String str){
        String first = "";
        String second = "";
        if (str.length()>=1 && str.substring(0,1).equals("o")){
            first = "o";
        }
        if (str.length()>=2 && str.substring(1,2).equals("z")){
            second = "z";
        }
        return first+second;
    }
}
