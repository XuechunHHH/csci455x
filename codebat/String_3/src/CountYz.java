public class CountYz {
    public static void main(String[] args) {
        System.out.println(countYZ("day fyyyz"));
    }

    public static int countYZ(String str){
        if (str.length()==0) return 0;
        str = str.toLowerCase();
        int cnt = 0;
        int len = str.length();
        for (int i=1;i<len;++i){
            if (!Character.isAlphabetic(str.charAt(i))&&
                    (str.substring(i-1,i).equals("y") || str.substring(i-1,i).equals("z"))){
                cnt++;
            }
        }
        if (str.substring(len-1,len).equals("y") || str.substring(len-1,len).equals("z")) cnt++;
        return cnt;
    }
}
