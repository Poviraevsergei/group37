package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
        /** Задача 1: "Поиск анаграмм"
        * Условие: Напишите метод, который принимает два слова и возвращает true,
        * если они являются анаграммами (состоят из одних и тех же букв в разном порядке).*/
public class Tasks {
    public static void main(String[] args) {
        String inputFirst = "кабан";
        String inputSecond = "банка";

        System.out.println(isAnagram(inputFirst, inputSecond));
    }

    public static boolean isAnagram(String first, String second) {
        HashMap<Character, Integer> letters = new HashMap<>();

        //подчитываем буквы в первом слове
        for (char symbol : first.toCharArray()) {
            letters.put(symbol, letters.getOrDefault(symbol, 0) + 1);
        }

        //проверяем второе слово
        for (char symbol : second.toCharArray()) {
            if (!letters.containsKey(symbol)) {
                return false;
            }
            letters.put(symbol, letters.get(symbol) - 1);
            if (letters.get(symbol) == 0) {
                letters.remove(symbol);
            }
        }

        return letters.isEmpty();
    }
}


/**
 * Задача 2: "Сломанный телефон"
 * Условие: У нас есть телефонная книга в виде HashMap (String(имя) -> Integer(номер)). Нужно создать обратную мапу (Integer(номер) -> String(имя)).
 *
 * Задача 3: "Поиск пропущенного числа"
 * Условие: Дан массив чисел от 1 до 10, где одно число пропущено. Найдите его.
 *
 * Задача 4: "Группировка по длине слова"
 * Условие: на вход массив из слов, нужно создать мапу которая хранит [3] ->[кот, ток], [4] -> [мода, вода]
 */
