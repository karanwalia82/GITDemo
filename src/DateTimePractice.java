import sun.util.calendar.BaseCalendar;

import java.time.*;
import java.time.DateTimeException;

public class DateTimePractice {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        LocalTime time1 = LocalTime.of(9, 48, 45, 999);
        System.out.println(time1);

        LocalDateTime dateTime = LocalDateTime.of(2019, 05, 02, 10, 20);
        System.out.println(dateTime);

        LocalDate date = LocalDate.of(2019, Month.JANUARY, 16);
        System.out.println(date);

        Period periodDays = Period.ofDays(10);
        Period periodMonths = Period.ofMonths(2);
        Period periodsYears = Period.ofYears(5);

        System.out.println(date.plus(periodMonths));
        System.out.println(date.plus(periodsYears));
        System.out.println(date.plusDays(20));


    }


}
