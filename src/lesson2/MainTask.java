package lesson2;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        /*
        С помощью цикла выведите таблицу умножения на число,
        введённое пользователем (от 1 до 10).
         *//*
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number < 11) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }*/

        /*
        Пользователь вводит два числа a и b (a < b).
        Выведите все числа от a до b включительно с помощью цикла.
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (; a <= b; a++) {
            System.out.println(a);
        }

    }
}
