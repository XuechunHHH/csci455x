public class middle2 {
    public static void main(String[] args) {
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str){
        int half = str.length()/2-1;
        return str.substring(half,half+2);
    }
}
