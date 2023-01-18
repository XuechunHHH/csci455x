import java.time.LocalDate;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(1995, Month.JANUARY,20);
        System.out.println(myDate.getMonthValue()+"/"+myDate.getDayOfMonth()+"/"+myDate.getYear());
        LocalDate later = myDate.plusDays(20);
        System.out.println(later.getMonthValue()+"/"+later.getDayOfMonth()+"/"+later.getYear());
    }
}
