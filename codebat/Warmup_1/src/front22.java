public class front22 {
    public static void main(String[] args) {
        System.out.println(front22("abc"));
    }

    public static String front22(String str){
        if (str.length()<=2) return str+str+str;
        String front = str.substring(0,2);
        return front + str + front;
    }
}
