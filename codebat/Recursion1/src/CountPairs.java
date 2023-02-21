public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("AxAxA"));
    }

    public static int countPairs(String str){
        if (str.length()<3) return 0;
        if (str.substring(0,1).equals(str.substring(2,3))) return 1+countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
}
