import java.time.LocalDate;
import java.util.Scanner;
public class Age {
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
        boolean happen;
        if (birthdayThisYear.isAfter(today)) {
            happen = false;
        }else{
            happen = true;
        }
        if (happen){
            System.out.println("You're "+(today.getYear()-birthday.getYear())+" years old.");
        } else {
            System.out.println("You're "+(today.getYear()-birthday.getYear()-1)+" years old.");
        }
    }
}
