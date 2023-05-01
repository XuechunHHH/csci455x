import java.util.*;

public class MapPrint {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("circle");
		al1.add("cleric");
		map.put("cceilr",al1);
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("hi");
		map.put("hi",al2);
		ArrayList<String> al3 = new ArrayList<>();
		al3.add("filer");
		al3.add("flier");
		al3.add("lifer");
		al3.add("rifle");
		map.put("eiflr",al3);
		ArrayList<String> al4 = new ArrayList<>();
		al4.add("and");
		map.put("adn",al4);
		ArrayList<String> al5 = new ArrayList<>();
		al5.add("inch");
		al5.add("chin");
		map.put("chin",al5);
		printDecrSize(map);
	}

	public static void printDecrSize(Map<String,ArrayList<String>> map){
		ArrayList<Map.Entry<String,ArrayList<String>>> arrlist = new ArrayList<>(map.entrySet());
		Collections.sort(arrlist,new SizeDec());
		for(Map.Entry<String,ArrayList<String>> entry : arrlist){
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}

class SizeDec implements Comparator<Map.Entry<String,ArrayList<String>>>{
	public int compare(Map.Entry<String,ArrayList<String>> entry1, Map.Entry<String,ArrayList<String>> entry2){
		return entry2.getValue().size()-entry1.getValue().size();
	}
}
