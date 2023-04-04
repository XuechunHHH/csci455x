import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyProg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a file name: ");
		String fileName = in.next();
		try {
			ArrayList<Integer> data = readFile(fileName);
			System.out.println("test");
		}catch (FileNotFoundException e){
			System.out.println("ERROR: File does not exist: "+fileName);
			System.out.println("Exiting program.");
		}
	}

	public static ArrayList<Integer> readFile(String fileName) throws FileNotFoundException{
		ArrayList<Integer> data = new ArrayList<>();
		File inFile = new File(fileName);
//		try{
			Scanner sc = new Scanner(inFile);
			while (sc.hasNext()){
				sc.next();
			}
			sc.close();
//		}
//		catch (FileNotFoundException e){
//			throw new FileNotFoundException("ERROR: File does not exist: "+fileName);
//		}
		return data;
	}
}
