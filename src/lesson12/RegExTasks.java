package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTasks {
    public static void main(String[] args) {
        //6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
        //найти имя и фамилию человека и вывести на экран!
        String input = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Matcher matcher = Pattern
                .compile("[А-Я][а-я]{2,} [А-Я][а-я]{2,}")
                .matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }



        //5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
        //System.out.println(input.replaceAll("\n",""));





      /*  //5. Удаление HTML-тегов из текста
        //Дано: строка с HTML
        // Задача: удалить все теги, оставив только текст
        // Пример: "<b>Hello</b> <div>world</div>" → "Hello world"
        System.out.println("<b>Hello</b> <div>world</div>".replaceAll("</?[A-z]+>", ""));
        System.out.println("<b>Hello</b> <div>world</div>".replaceAll("<[^><]+>", ""));*/

       /* //3. Поиск всех чисел в тексте
        //Дано: произвольный текст
        // Задача: найти все целые и дробные числа (включая отрицательные)
        // Пример: "Температура -3.5°C, рост 180" → ["-3!5", "180"]

        String input = "Температура -3.5°C, рост 180";

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/


          /*      //2. Извлечение доменов из email-адресов
        //Дано: список email-адресов
        // Задача: извлечь доменную часть (после @)
        // Пример: "ivan.petrov@gmail.com" → "gmail.com"
        // Пример: "anna@ya.ru" → "ya.ru"
        String inputEmail = "Hello anna@ya.ru !!!";
        Pattern pattern = Pattern.compile(".+@([A-z]{2,}\\.[A-z]{2,}).*");
        Matcher matcher = pattern.matcher(inputEmail);

        if (matcher.matches()) {
            System.out.println(matcher.group(1));
        }*/

        /*//1. Удаление повторяющихся пробелов
        //Задача: заменить все последовательности пробелов на один
        // Пример: "Это       пример      текста" → "Это пример текста"
        //"ivan.petrov@gmail.com" "anna@ya.ru"
        //
        String input = "Это       пример      текста"; //"Это пример текста"

        input = input.replaceAll(" +"," ");

        System.out.println(input);*/
    }
}
