public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 3));
    }

    public static String frontTimes(String str, int n){
        String substr;
        if(str.length()<=3){
            substr = str;
        }else{
            substr = str.substring(0,3);
        }
        String ans = "";
        for(int i=0;i<n;++i){
            ans += substr;
        }
        return ans;
    }
}
