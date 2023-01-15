public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    public static int stringMatch(String a, String b){
        int len = Math.min(a.length(),b.length());
        int count = 0;
        for (int i=0;i<len-1;++i){
            String suba = a.substring(i,i+2);
            String subb = b.substring(i,i+2);
            if(suba.equals(subb)){
                count++;
            }
        }
        return count;
    }
}
