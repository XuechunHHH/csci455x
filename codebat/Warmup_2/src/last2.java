public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("axxxaaxx"));
    }

    public static int last2(String str){
        if (str.length()<=2) return 0;
        String substr = str.substring(str.length()-2,str.length());
        int count = -1;
        for(int i=0;i<str.length()-1;++i){
            if(str.substring(i,i+2).equals(substr)){
                count++;
            }
        }
        return count;
    }
}
