public class ChangeXY {
    public static void main(String[] args) {
        System.out.println(changeXY("xhixhix"));
    }

    public static String changeXY(String str){
        if (str.length()==0) return str;
        if (str.substring(0,1).equals("x")) return "y" + changeXY(str.substring(1));
        return str.substring(0,1)+changeXY(str.substring(1));
    }
}
