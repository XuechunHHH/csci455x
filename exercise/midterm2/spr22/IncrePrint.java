public class IncrePrint {
	public static void main(String[] args) {
		int a = 5;
		print(a);
	}

	public static void print(int num) {
		if (num < 10) {
			System.out.print(num);
		} else {
			System.out.print(IncreR(num / 10, num % 10 + ""));
		}
	}

	private static String IncreR(int num, String str) {
		if (num<10){
			return num + ","+str;
		}else{
			str = num%10+","+str;
			return IncreR(num/10,str);
		}
	}
}
