import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 Reads a data set from a file. The file must have the format
 numberOfValues
 value1
 value2
 . . .
 */
public class DataSetReader
{
    private double[] data;

    /**
     Reads a data set.
     @param filename the name of the file holding the data
     @return the data in the file
     */
    public double[] readFile(String filename) throws IOException
    {
//        formatCheck(filename);
        File inFile = new File(filename);
        try (Scanner in = new Scanner(inFile))
        {
            readData(in);
            return data;
        }
    }

    /**
     Reads all data.
     @param in the scanner that scans the data
     */
    private void readData(Scanner in) throws BadDataException
    {
        if (!in.hasNextInt())
        {
            throw new BadDataException("Length expected");
        }
        int numberOfValues = in.nextInt();
        data = new double[numberOfValues];

        for (int i = 0; i < numberOfValues; i++)
        {
            readValue(in, i);
        }

        if (in.hasNext())
        {
            throw new BadDataException("Too many data values given");
        }
    }

    /**
     Reads one data value.
     @param in the scanner that scans the data
     @param i the position of the value to read
     */
    private void readValue(Scanner in, int i) throws BadDataException
    {
        if (!in.hasNext()){
            throw new BadDataException("Too few data values given");
        }else{
            String next = in.next();
            try {
                data[i] = Double.parseDouble(next);
            }catch (Exception exception){
                throw new BadDataException("Non-floating point value given: "+next);
            }
        }
//        if (!in.hasNextDouble())
//        {
//            throw new BadDataException("Data value expected");
//        }
//        data[i] = in.nextDouble();
    }

    private void formatCheck(String filename) throws IllegalFormatException
    {
        if (!filename.substring(0,3).equals("in."))
        {
            throw new IllegalFormatException("Illegal file format.");
        }
    }

}