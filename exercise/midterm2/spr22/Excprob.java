import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excprob {
    public static void main(String[] args) {
        int num = 20;
        try {
            Scanner inFile = new Scanner(new File("C:\\USC\\github\\csci455x\\exercise\\midterm2\\src\\data"));
            while(inFile.hasNext()){
                int inVal = inFile.nextInt();
                num = num+inVal;
                System.out.println("Sansa");
            }
        }
        catch (InputMismatchException exc){
            System.out.println("Problem with file");
        }
        catch (FileNotFoundException exc){
            System.out.println("File not found");
        }
        System.out.println("Answer: " + num);
    }
}
