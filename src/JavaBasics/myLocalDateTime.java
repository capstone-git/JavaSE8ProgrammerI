package JavaBasics;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class myLocalDateTime {

    LocalDateTime now = LocalDateTime.now();

    {
        LocalDateTime utcTimestamp = LocalDateTime.now(ZoneId.of("PST"));

        LocalDateTime now = LocalDateTime.now(); //2023-02-14T02:47:24.362

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now
                .format(format); //14-02-2023 02:47:24


        LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
        System.out.println(a.get(ChronoField
                .DAY_OF_WEEK));
        System.out.println(a.get(ChronoField
                .DAY_OF_YEAR));
        System.out.println(a.get(ChronoField
                .DAY_OF_MONTH));
        System.out.println(a.get(ChronoField
                .HOUR_OF_DAY));
        System.out.println(a.get(ChronoField
                .MINUTE_OF_DAY));

        LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime datetime2 = datetime1
                .minusDays(100);
        datetime2.plusDays(100);

    }

}
