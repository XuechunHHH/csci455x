public class PairStar {
    public static void main(String[] args) {
        System.out.println(pairStar("hhelllo"));
    }

    public static String pairStar(String str){
        if (str.length()<=1) return str;
        if (str.substring(0,1).equals(str.substring(1,2))) return str.substring(0,1)+"*"+pairStar(str.substring(1));
        return str.substring(0,1)+pairStar(str.substring(1));
    }
}


