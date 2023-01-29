public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadjambreadyy"));
    }

    public static String getSandwich(String str){
        if(str.length()<11) return "";
        int first = -1;
        int last = -1;
        for (int i=0;i<str.length()-5;++i){
            if (str.substring(i,i+5).equals("bread")){
                first = i+5;
                break;
            }
        }
        for(int j=str.length();j>5;--j){
            if (str.substring(j-5,j).equals("bread")){
                last = j-5;
                break;
            }
        }
        if (first !=-1 && last !=-1){
            return str.substring(first,last);
        }
        return "";
    }
}
