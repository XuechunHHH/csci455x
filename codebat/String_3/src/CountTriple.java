public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("xxxabyyyycd"));
    }

    public static int countTriple(String str){
        int len = str.length();
        if (len<3) return 0;
        int cnt = 0;
        for (int i=1;i<len-1;++i){
            if (str.charAt(i)==str.charAt(i-1) && str.charAt(i)==str.charAt(i+1))cnt++;
        }
        return cnt;
    }
}
