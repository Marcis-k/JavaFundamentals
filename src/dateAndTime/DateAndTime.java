package dateAndTime;

import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {

        //Local time
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println();
//        System.out.println(LocalTime.now()); // Tas pats kas virs
//        System.out.println();
//        System.out.println(LocalTime.now().withNano(0)); // Bez nano sekundem
//        System.out.println();
//        System.out.println(LocalTime.now().withNano(0).withSecond(0)); // mez sekundēm
//        System.out.println();
//        System.out.println(localTime.plusHours(1).plusMinutes(10));  //Pieliek klat esošajam laikam
//
//        String formatTime = localTime.getHour()+"_"+ localTime.getMinute()+"_"+ localTime.getSecond();
//        System.out.println(formatTime);

        //Local Date
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println();
//        System.out.println(localDate.getYear());
//        System.out.println();
//        System.out.println(localDate.getMonth());
//        System.out.println();
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println();
//        System.out.println(localDate.getDayOfYear());
//        System.out.println();
//
//        LocalDate historyDate = LocalDate.of(1918, Month.NOVEMBER,18);
//        System.out.println(historyDate);
//        System.out.println();

        //Date and Time
//        LocalDateTime localDateTime = java.time.LocalDateTime.now();
//        System.out.println(localDateTime);
//        System.out.println();
//        System.out.println(localDateTime.getYear());
//
//        LocalDateTime localDateTime1 = LocalDateTime.of(1918,Month.NOVEMBER,18,13,44);
//        System.out.println(localDateTime1);

        // Duration and Period


        LocalDate localDate = LocalDate.now();
        System.out.println("in 24h is "+Duration.ofHours(24).toMinutes()+" minutes");
        System.out.println();
        System.out.println(Duration.between(localDate,localDate.plusDays(100)));



    }
}
