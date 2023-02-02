public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean equalIsNot(String str){
        int len = str.length();
        if (len==0) return true;
        if (len<=3) return false;
        int cntIs = 0;
        int cntNot = 0;
        for (int i=0;i<=len-2;++i){
            if (str.substring(i,i+2).equals("is")) cntIs++;
        }
        for (int i=0;i<=len-3;++i){
            if (str.substring(i,i+3).equals("not")) cntNot++;
        }
        if (cntIs==cntNot) return true;
        return false;
    }
}
