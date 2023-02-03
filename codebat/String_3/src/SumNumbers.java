public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }

    public static int sumNumbers(String str){
        int len = str.length();
        if (len==0) return 0;
        int sum = 0;
        for (int i=0;i<len;){
            int index = i;
            while (Character.isDigit(str.charAt(i))){
                i++;
                if(i==len) break;
            }
            if(index!=i) sum += Integer.parseInt(str.substring(index,i));
            i++;
        }
        return sum;
    }
}
