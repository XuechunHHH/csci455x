import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Sam");
		names.add("Alice");
		names.add("Bob");
		nickNamer(names);
		System.out.println(names);
	}

	public static void nickNamer(ArrayList<String> names){
		names.replaceAll(new Replace());
	}
}

class Replace implements UnaryOperator<String>{
	public String apply(String str){
		return "The " + str + "-inator";
	}
}
