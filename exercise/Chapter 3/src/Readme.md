1.0 Xuechun Hua

1.1 import java.time.LocalDate

1.2 LocalDate myDate = LocalDate.of(1995, Month.JANUARY,20);

1.3 System.out.println(myDate.getMonthValue()+"/"+myDate.getDayOfMonth()+"/"+myDate.getYear());

1.4 LocalDate later = myDate.plusDays(20);

1.5 myDate = myDate.plusDays(20);

2
```java
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
```

3 
```java
import java.time.LocalDate;
import java.time.Month;
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

``` 

3.2 12/7/1999 not; 1/17/2023 happened ; 1/1/1999 happened.

4
```java
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
```