public class MaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    public static int maxBlock(String str){
        int len = str.length();
        if (len<=1) return len;
        int max = 1;
        int cnt = 1;
        for (int i=0;i<len-1;++i){
            if (str.charAt(i)==str.charAt(i+1)){
                cnt++;
                if(i==len-2 && cnt>max) max = cnt;
            }else {
                if (cnt>max) max = cnt;
                cnt = 1;
            }
        }
        return max;
    }
}
