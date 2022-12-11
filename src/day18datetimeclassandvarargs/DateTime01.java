package day18datetimeclassandvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        /*
        How to get current date by typing JAVA code.
         */
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);   // 2022-09-28  ... This is default format.

        /*
        How to get current time by typing JAVA code.
         */

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);   // 12:18:01.439634

        // 12:18:01.439634 .. first part is hour, then minutes, then seconds and last one is nanoseconds.

        /*
        How to get current date and time by typing JAVA code.
         */

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        // 2022-09-28T12:19:51.986180  ... First part is date .. T stands for time

        /*
        How to get current date in a country by typing JAVA code.
         */

        LocalDate currentDateJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateJapan);

        /*
        How to get current time in a country by typing JAVA code.
         */
        LocalTime currentTimeJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeJapan);

        /*
        How to get current date and time in a country by typing JAVA code.
         */
        LocalDateTime currentDateTimeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeJapan);

        /*
        How to go to future in date?
         */

        LocalDate cd1 = LocalDate.now();    // cd stands for current date
        cd1.plusDays(120);
        //assign it to a new variable (container)
        LocalDate cd1Next = cd1.plusDays(120);
        System.out.println(cd1Next);

        LocalDate cd1NextNext = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1NextNext);

        // If we use a multiple methods side by side, it's called method chain.

        /*
        How to go to past for dates?
         */
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

       // Homework:  Type code to learn how to go future and past in time.

        /*
        How to go to future in time?
         */
        LocalTime ct1 = LocalTime.now();
          LocalTime ct1Next = ct1.plusHours(60);
        System.out.println(ct1Next);

        /*
        How to go to past in time?
         */
        LocalTime ct2 = LocalTime.now();
        LocalTime ct2Past = ct2.minusHours(60);
        System.out.println(ct2Past);



        /*
        How to get a specific part of time e.g. just the hour or just the minutes.
         */
        LocalTime ct3 = LocalTime.now();
        int hour = ct3.getHour();
        System.out.println(hour);

        int minute = ct3.getMinute();
        System.out.println(minute);


        /*
        How to change the format of the date?
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");   // Uppercase M is for month; lowercase m is for minutes
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");   // 3 MMM gives you first 3 characters of the month
        String formattedCurrentDate2 = dt.format(cd1);                   // 2 yy give you last 2 digits of the year.
        System.out.println(formattedCurrentDate2);


        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");  // // 4 MMMM gives you full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);


        /*
        How to change the format of the time?
         */
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);

        // hh uses 12 hour system, HH uses 24 hour system.
        // single 'a' is to display am/pm.

        /*
        How to create a specific date?
         */

        LocalDate dob1 = LocalDate.of(2018,01,01);
        LocalDate dob2 = LocalDate.of(2023, Month.JANUARY, 01);

        /*
        Enum is something like class. Normally in a class you have variables and methods. in Enums you may
        have variables and methods well. but when we create enum we use it to store constant variables.
        Unchangeable variables. like months... Whenever you need Unchangeable variables use enum.
        For example, you are creating for Honda - honda has some models like civic HRV ... their names will
        not change anytime honda civic exists for many years. If you are sure they will remain same for long
        time.you are creating application for Honda you will use civic model many times in your application.
        you put them in enum when you need models you go to enum select it from there and use. you don't need
        to memorise model names. go to enum and get the one you need. When you  create a value in enum you can
        add values?. For example, you are working with states in the USA create an enum and put states in it. then
        you create method to get variables from that enum.
         */
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);

        //In isBefore() method, if the first date is before the second date you get true;
        //Otherwise you will get false in case of equality and first is after.


        boolean is= dob2.isBefore(dob1);
        System.out.println(is);

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);








    }
}
