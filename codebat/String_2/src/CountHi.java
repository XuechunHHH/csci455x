public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("ABChi hi"));
    }

    public static int countHi(String str){
        if (str.length()<2) return 0;
        int cnt = 0;
        for (int i=0;i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("hi")) cnt++;
        }
        return cnt;
    }
}
