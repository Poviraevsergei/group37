package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegEx {
    public static void main(String[] args) {
        //System.out.println("37533".matches("[+]?375((29)|(33))"));

        //4. Извлечение даты из строки
        //Дано: строка "Дата: 2024-07-22" Задача: извлечь дату в формате YYYY-MM-DD Пример: "2024-07-22"
        String date = "2024-07-22";

        //Pattern
        Pattern pattern = Pattern.compile("\\d{4}(-\\d{2})-\\d{2}");

        Matcher matcher = pattern.matcher(date);
        while (matcher.find()){
            System.out.println("Начинается с индекса " + matcher.start());
            System.out.println("Заканчивается на индексе " + matcher.end());
            System.out.println("Совпадение " + matcher.group());
        }

        //if (matcher.matches()) {
        //    System.out.println("Всю строку " + matcher.group(0));
        //    System.out.println("Совпадение первое " + matcher.group(1));
        //}

        //Что ищем
        //числовые: [1234567890] [0-9]
        //пробелы " " \\s
        //символьные [abc] [a-h] [A-z] \\w - буквенно-числовые и _
        //. - любой символ

        //Сколько
        //{1} {2,5} {2,}
        //+ один и больше
        //? один или нет
        //* ноль и больше       Hello ............... world!
    }
}
