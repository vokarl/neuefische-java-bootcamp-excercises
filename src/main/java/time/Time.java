package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();                      // localDate
        System.out.println(date);
        LocalDate newDate = date.plusDays(3);
        System.out.println(newDate);
        System.out.println("---------------------------------");
        ZoneId zoneId = ZoneId.systemDefault();                       // used multiple times!!!
        System.out.println(zoneId);
        System.out.println("---------------------------------");
   // .instant- revolving:  //Exercise1:
        Instant instant=Instant.now();

        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        Instant convertedInstant = localDateTime.atZone(zoneId).toInstant();



        System.out.println("Exercise 1 output date & time--------------------------");
        System.out.println("my local time: " + localDateTime);
        System.out.println("instant utc: " +convertedInstant);
        System.out.println("Exercise 2 add 2 weeks  ------------------------------");
        LocalDate plusTwoWeeks = date.plusWeeks(2);
        System.out.println("my local time plus two weeks: " + plusTwoWeeks);
        System.out.println("Exercise 3   Compare current date with future date & before | after?---------");



                System.out.println("Current Date: " + date);

                LocalDate futureDate = LocalDate.of(2025, 12, 31);
                System.out.println("Future Date: " + futureDate);

                if (date.isBefore(futureDate)) {
                    System.out.println("Current date is before the future date.");
                } else if (date.isAfter(futureDate)) {
                    System.out.println("Current date is after the future date.");
                } else {
                    System.out.println("Current date is equal to the future date.");
                }

        System.out.println("Exercise 4 difference in days between the dates---------------");
        LocalDate date1 = LocalDate.of(2023, 8, 12);
        LocalDate date2 = LocalDate.of(2023, 12, 25);

        long daysDifference = ChronoUnit.DAYS.between(date1, date2);         //

        System.out.println("Difference in days: " + daysDifference);

            }
        }






