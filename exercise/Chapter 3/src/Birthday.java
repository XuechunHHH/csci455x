import java.time.LocalDate;
import java.util.Scanner;
public class Birthday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your birth month [1..12]:");
        int month = in.nextInt();
        System.out.println("Enter your birth day of month: ");
        int day = in.nextInt();
        System.out.println("Enter your birth year [4-digit year]:");
        int year = in.nextInt();
        LocalDate birthday = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();
        LocalDate birthdayThisYear = birthday.withYear(today.getYear());
        if (birthdayThisYear.isAfter(today)) {
            System.out.println("Your birthday has not yet happened this year.");
        }else{
            System.out.println("Your birthday has already happened this year");
        }
    }
}
