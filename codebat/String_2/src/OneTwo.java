public class OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("tcagdo"));
    }

    public static String oneTwo(String str){
        int last = str.length()/3*3;
        String res ="";
        if (str.length()<3) return "";
        for (int i=0;i<=last-3;i+=3){
            res += str.substring(i+1,i+3)+str.substring(i,i+1);
        }
        return res;
    }
}
