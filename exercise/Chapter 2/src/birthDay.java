// book worked example 2.1: computes how many days have elapsed since the day you were born
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class birthDay {
    public static void main(String[] args) throws ParseException {
        long today = new Date().getTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your birth day (format yyyy-MM-dd): ");
        String birthday = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long birth = sdf.parse(birthday).getTime();
        long time = today - birth;
        System.out.println("You were born "+time/1000/60/60/24+" days ago!");
    }
}
