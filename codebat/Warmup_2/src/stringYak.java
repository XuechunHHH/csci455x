public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yak123ya"));
    }

    public static String stringYak(String str){
        for(int i=0;i<str.length()-2;++i){
            if(str.charAt(i) == 'y' && str.charAt(i+2) == 'k'){
                str = str.substring(0,i)+str.substring(i+3);
            }
        }
        return str;
    }
}
