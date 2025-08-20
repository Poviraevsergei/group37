package lesson2;

import java.util.Scanner;

public class IfSwitchMain {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        if (a > b) {
            System.out.println("A больше B");
        } else if (a < b) { //TODO: вот тут может быть баг!
            System.out.println("A меньше B");
        } else {
            System.out.println("Они равны");
        }
        System.out.println("-------------------");
        //1. однострочные

        /*
        многострочный комментарий
        многострочный комментарий
        многострочный комментарий
        многострочный комментарий
        многострочный комментарий
         */

        /**
         * Тернарный оператор
         */

        System.out.println("-------------------");

        //  (условие) ? YES : NO;
        System.out.println((a % 2 == 0) ? "четное" : "не четное");

        /*
        if (условие) {
            YES
        } else {
            NO
        }*/
        String ifResult;
        if (a % 2 == 0) {
            ifResult = "четное";
        } else {
            ifResult = "не четное";
        }
        System.out.println(ifResult);

        System.out.println("-------------------");
        //2. Вывести строкой число от 1 до 5 которое будет передано в switch.
        // Если число не в этом диапазоне, сообщить об этом.
        // Пример:
        //
        //Передаём 3, вывод в консоль “three”.
        //Передаем 5, вывод “five”.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //Старая версия
        switch (number) {
            case 1:
                System.out.println("One");
                break; //выйди из switch
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Введите от 1 до 5.");
        }

        //Новая версия(с присваиванием в переменную)
        String line = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            default -> "Введите от 1 до 5.";
        };

        String day = "суб";
        switch (day){
            case "пон":
            case "вт":
            case "ср":
            case "чт":
            case "пт":
                System.out.println("будний");
                break;
            case "суб":
            case "воск":
                System.out.println("выходной");
        }

        System.out.println(line);
        System.out.println("-------------------");
    }
}
