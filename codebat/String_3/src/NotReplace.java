public class NotReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str){
        int len = str.length();
        if (len < 2) return str;
        for (int i=0;i<len-1;++i){
            if (i==0 && str.substring(i,i+2).equals("is") && (i+2==len || !Character.isLetter(str.charAt(i+2)))){
                str = "is not"+str.substring(i+2);
            } else if (i==len-2 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1))) {
                str = str.substring(0,i)+"is not";
            } else if (i>0 && i<len-2 && str.substring(i,i+2).equals("is")
                        && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
                str = str.substring(0,i) +"is not"+str.substring(i+2);
            }
            len = str.length();
        }
        return str;
    }
}
