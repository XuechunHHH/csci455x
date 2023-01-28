public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str){
        if(str.length()<3) return false;
        for (int i=0;i<str.length()-2;++i){
            if (str.substring(i,i+3).equals("xyz") && (i==0 || str.charAt(i-1)!='.')) return true;
        }
        return false;
    }
}
