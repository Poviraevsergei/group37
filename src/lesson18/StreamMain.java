package lesson18;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<String> nameList = List.of("START", "Alex", "Lydmila", "Galina");
        nameList.stream()
                //.peek(e -> peekExample(e))
                //.distinct()
                .parallel()
                .filter(e -> e.length() > 5)
                //.skip(1)
                //.limit(2)
                //.sorted()
                //.mapToLong(Long::parseLong)
                //.map(s -> s.length()) // "Lydmila" -> "LYDMILA"
                //.flatMap(e -> Arrays.stream(e.split("l")))

                //Терминальные функции
                //.findFirst();
                //.findAny();
                //.collect(Collectors.toList());
                //.count();
                //.allMatch(e -> e.equals("Lydmila"));
                //.anyMatch(e -> e.equals("Lydmila"));
                //.noneMatch(e -> e.equals("LydmilaTest"));
                //.min((w1, w2) -> Integer.compare(w1.length(), w2.length()));
                //.max((w1, w2) -> Integer.compare(w1.length(), w2.length()));
                .forEach(System.out::println);

    }

    public static void peekExample(String line) {
        System.out.println("Я был тут " + line);
    }
}
