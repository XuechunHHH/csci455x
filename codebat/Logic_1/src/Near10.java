public class Near10 {
    public static void main(String[] args) {
        System.out.println(nearTen(19));
    }

    public static boolean nearTen(int num){
        return num%10<=2 ||num%10>=8;
    }
}
