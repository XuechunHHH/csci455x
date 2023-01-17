public class twoChar {
    public static void main(String[] args) {
        System.out.println(twoChar("java", 3));
    }

    public static String twoChar(String str, int index){
        if (str.length() <= index+1 || index < 0) return str.substring(0,2);
        return str.substring(index,index+2);
    }
}
