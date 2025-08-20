package lesson2;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        //ctrl+alt+l - приводит код в правильное состояние

        //если хотите почитать код/документацию CTRL
        //Scanner - класс который позволяет вносить данные в консоль
        //1. Создание объекта сканера
        Scanner scanner = new Scanner(System.in);

        //2. использование
        System.out.println("Введите данные возраста: ");
        //String name = scanner.next(); //возвращет строку до первого пробела
        //String name = scanner.nextLine(); //возвращет ВСЮ строку
        //System.out.println("Мое имя: " + name);
        if (scanner.hasNext()) {
            String age = scanner.next();
            System.out.println(age);
        }

        //3. закрытие сканера - чтобы не было утечки памяти
        scanner.close();

        //Задача 1:
        // Ввести с консоли любое число. Если оно четное – вывести его в консоль.
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();

        if (number % 2 == 0) {
            System.out.println(number);
        }
    }
}
