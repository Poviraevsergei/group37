package lesson4;

import java.util.Arrays;
import java.util.Iterator;

public class MainArray {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //инициализация пустого массива    0 1 2 3 4 5 ... 99
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 70;
        numbers[3] = 40;
        numbers[4] = 20;

        //String[] names1 = {"Alex", "Dima", "Alina", "Jan", "Kim", "Lena"}; //инициализация массива со значениями
        System.out.println(numbers.length);
        //numbers.length - возвращает кол-во ячеек


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //For each - перебор numbers, не используем если хотим изменять эл-ты!!!
        //Iterator - сущность которая перебирает эл-ты друг за другом
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("---------------------------------------------");
        //2. Верни массив, исключив все нули. Например: [0, 1, 0, 2,0,0,0,0,0] → [1, 2]./
        int[] array = {1, 2, 0, 5, 0, 1};
        int countElement = 0;

        for (int element : array) {
            if (element != 0) {
                countElement++;
            }
        }

        if (countElement != 0) {
            int index = 0;
            int[] resultArray = new int[countElement];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    resultArray[index++] = array[i];
                }
            }

            for (int i : resultArray) {
                System.out.println(i);
            }
        }
        System.out.println("---------------------------------------------");
        //Arrays - класс для работы с массивами
        Arrays.sort(numbers); // сортировка(Можно передать Comporator)
        System.out.println(Arrays.toString(numbers)); //преобразует массив в строку
        System.out.println(Arrays.binarySearch(numbers, 20)); //Бинарный поиск(массив должен быть отсортированным.
        Arrays.asList(numbers); //преобразует массив в List коллекцию.
        System.out.println(Arrays.equals(numbers, array)); //сравнение массивов (возвращает boolean)
        System.out.println(Arrays.compare(numbers, array)); //сравнение массивов (возвращает int)
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, 0, 3))); //копирует значение из массива в диапазоне
        Arrays.fill(numbers, 50); //заполняет каждую ячейку массива значением из параметров
        System.out.println("---------------------------------------------");
        //3. Массив читается одинаково слева направо и справа налево?
        String[] brands = {"BMW1", "Audi2", "Lada3", "Audi4", "BMW5"};
        boolean palindrome = true;
        for (int i = 0; i < brands.length / 2; i++) {
            if (brands[i] != brands[brands.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        System.out.println("Palindrome: " + palindrome);

        //Обратный перебор
        for (int i = brands.length - 1; i >= 0; i--) {
            System.out.println(brands[i]);
        }
    }
}






/*
Задачи:
3. Массив читается одинаково слева направо и справа налево?
4. Сдвинь элементы массива на 1 позицию вправо, последний элемент переходит в начало.
5. Удалить элемент по значению. Удали первое вхождение заданного значения из массива. Верни новый массив без него.
6. Найди среднее арифметическое значений в массиве без учета максимального и минимального значения.
7. Создай два новых массива: один из положительных, другой из отрицательных чисел исходного.
Сложные:
1. Поиск второго по величине числа. Найди второй наибольший элемент без сортировки.
 */
