public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("aa11b33"));
    }

    public static int sumDigits(String str){
        int sum = 0;
        for (int i=0;i<str.length();++i){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }
}
