public class backAround {
    public static void main(String[] args) {
        System.out.println(backAround("Hello"));
    }

    public static String backAround(String str){
        Character last = str.charAt(str.length()-1);
        return last+str+last;
    }
}
