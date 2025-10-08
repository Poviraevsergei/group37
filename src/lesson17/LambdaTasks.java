package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTasks {
    public static void main(String[] args) {
        List<String> inputLines = List.of("Hello", "world", "OR", "Sergey","Year");
        List<Integer> inputNumber = List.of(1, 2, 3, 4);

        // Task 1
        Predicate<String> isFiveLength = s -> s.length() > 5;
        Predicate<String> isFirstUpperCase = s -> String.valueOf(s.charAt(0)).matches("[A-ZА-Я]");

        //System.out.println(filter(inputLines, isFirstUpperCase));

        // Task 2
        //IntToStringConverter intToStringConverter = i -> "Число: " + i; // String::valueOf
        //System.out.println(convertAll(inputNumber, intToStringConverter));

        //Кол - во слов содержащих букву 'а'
        StringCondition containsACharacter = s -> s.contains("a");

        // Task 3
        StringCondition isUpperCase = s -> s.equals(s.toUpperCase());
        System.out.println(count(inputLines,isUpperCase));
    }

    public static List<String> filter(List<String> input, StringFilter filter) {
        List<String> resultValues = new ArrayList<>();

        for (String line : input) {
            if (filter.accept(line)) {
                resultValues.add(line);
            }
        }
        return resultValues;
    }

    public static List<String> convertAll(List<Integer> input, IntToStringConverter converter) {
        List<String> resultList = new ArrayList<>();
        for (Integer i : input) {
            resultList.add(converter.convert(i));
        }
        return resultList;
    }

    public static int count(List<String> input, StringCondition condition) {
        int counter = 0;
        for (String line : input) {
            if (condition.test(line)) {
                counter++;
            }
        }
        return counter;
    }
}

/**
 * Создайте функциональный интерфейс StringFilter с методом boolean accept(String s).
 * В Main реализуйте метод public static List<String> filter(List<String> input, StringFilter filter).
 * 1. Отфильтруйте/оставьте только те строки длинна которых больше 5 символов
 * 2. Отфильтруйте/оставьте только те строки которые начинаются с большой буквы
 * <p>
 * Создайте функциональный интерфейс IntToStringConverter с методом String convert(int value).
 * В Main реализуйте метод public static List<String> convertAll(List<Integer> input, IntToStringConverter converter) который будет преобразовывать число n в строку "Число: n".
 * <p>
 * Создайте функциональный интерфейс StringCondition с методом boolean test(String s).
 * В Main реализуйте метод public static int count(List<String> input, StringCondition condition)
 * 1. Кол-во слов содержащих букву 'а'
 * 2. Кол-во слов написанных UpperCase
 */
