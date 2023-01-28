public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("cozexxcope"));
    }

    public static int countCode(String str){
        if (str.length()<4) return 0;
        int cnt = 0;
        for (int i=0;i<str.length()-3;++i){
            if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")) cnt++;
        }
        return cnt;
    }
}
