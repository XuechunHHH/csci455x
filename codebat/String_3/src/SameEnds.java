public class SameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("xxx"));
    }

    public static String sameEnds(String string){
        int len = string.length();
        if (len<2) return "";
        String temp ="";
        String res = "";
        for (int i=0;i<len/2;++i){
            temp = string.substring(0,i+1);
            int tlen = temp.length();
            if (temp.equals(string.substring(len-tlen))){
                res = temp;
            }
        }
        return res;
    }
}
