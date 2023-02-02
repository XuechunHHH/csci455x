public class GHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggyygxx"));
    }

    public static boolean gHappy(String str){
        int len = str.length();
        if (len==0 || len==1 && !str.equals("g")) return true;
        if (len==1 && str.equals("g")) return false;
        for (int i=0;i<len;++i){
            if (i==0 && str.substring(i,i+1).equals("g") && !str.substring(i+1,i+2).equals("g")) return false;
            else if (i==len-1 && str.substring(i,i+1).equals("g") && !str.substring(i-1,i).equals("g")) return false;
            else if (i>0 && i<len-1 && str.substring(i,i+1).equals("g") &&
                    !str.substring(i-1,i).equals("g") && !str.substring(i+1,i+2).equals("g")) return false;
        }
        return true;
    }
}
