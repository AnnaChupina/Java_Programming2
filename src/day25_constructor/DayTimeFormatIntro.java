package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));   //  July-01-22    ("MMMM-dd-yy")




        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,5);  // 05:05




        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/yy hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));

        LocalDateTime day1 = LocalDateTime.of(2020,11,24,13,0)    ;
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        System.out.println(day1.format(dtf1));



    }
}
