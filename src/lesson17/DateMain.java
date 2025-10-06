package lesson17;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;

public class DateMain {
    public static void main(String[] args) {
        //LocalDate LocalTime LocalDateTime
        LocalDate rightNow = LocalDate.now().plusDays(10).minusWeeks(1);
        LocalDate javaDeveloperDay = LocalDate.of(2026, Month.MAY, 23);
        LocalDate ny = LocalDate.parse("2026-01-01");
        LocalDate ny1 = LocalDate.parse("2027/01/01",DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(ny1);

        //Изменить
        System.out.println(rightNow.plusDays(10));
        System.out.println(rightNow.plus(10, ChronoUnit.DAYS));
        System.out.println(rightNow.minus(1, ChronoUnit.CENTURIES));

        //Получить данные
        DayOfWeek ilyaBDay = LocalDate.parse("1994-01-12").getDayOfWeek();
        System.out.println(ilyaBDay);
        System.out.println(LocalDate.now().isLeapYear());

        //Сравнение дат
        System.out.println(ny.isBefore(LocalDate.now()));
        System.out.println(ny.isAfter(LocalDate.now()));

        System.out.println(LocalDate.EPOCH);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        //Создание часового пояса
        ZoneId zoneId = ZoneId.of("Europe/Minsk");

        System.out.println(LocalDateTime.now(zoneId));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds);

        //Преобразование даты
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        System.out.println(localDateTime);

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yy//MM//dd")));

        System.out.println(Timestamp.valueOf("2018-11-12 01:02:03.123456789").toLocalDateTime());
    }
}
