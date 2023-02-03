public class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string){
        int len = string.length();
        int index = -1;
        for (int i=0;i<len;++i){
            if (string.charAt(i)==string.charAt(len-i-1)){
                index = i;
            }else{
                break;
            }
        }
        if (index == -1) return "";
        return string.substring(0,index+1);
    }
}
