public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str){
        String ans = "";
        for(int i=0;i<str.length();){
            ans += str.charAt(i);
            if(i % 4 == 0){
                i++;
            } else{
                i += 3;
            }
        }
        return ans;
    }
}
