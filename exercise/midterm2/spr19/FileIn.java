import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIn {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            String fileName = "foo";
            ArrayList<Integer> data = readFile(fileName);
            data.isEmpty();
            data.toString();
        }catch (IOException e){
            System.out.println("Caught IOException. Exiting program.");
        }
    }

    public static ArrayList<Integer> readFile(String fileName) throws IOException {
        ArrayList<Integer> data = new ArrayList<>();
        File inFile = new File(fileName);
        try (Scanner fileScanner = new Scanner(inFile)){
            while(fileScanner.hasNext()){
                String input = fileScanner.next();
                int num = Integer.parseInt(input);
                data.add(num);
            }
        }
        return data;
    }
}
