public class ParenBit {
    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)12"));
    }

    public static String parenBit(String str){
        if (str.length()==0 || str.charAt(0)=='(' && str.charAt(str.length()-1)==')') return str;
        if (str.charAt(0) != '(' && str.charAt(str.length()-1) != ')') return parenBit(str.substring(1,str.length()-1));
        if (str.charAt(0) == '(' && str.charAt(str.length()-1) != ')') return parenBit(str.substring(0,str.length()-1));
        return parenBit(str.substring(1,str.length()));
    }
}
