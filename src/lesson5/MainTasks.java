package lesson5;

import java.util.Arrays;
import java.util.Random;

public class MainTasks {
    public static void main(String[] args) {
        /*        *//**
         * Создайте двумерный массив и заполните его псевдослучайными числами с помощью
         * класса Random.
         * 1.2 Найдите максимальное значение в созданном 2-мерном массиве.
         *//*

        int[][] numbers = new int[2][5];
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE; //константа хранит минимальное int значение
        int indexI = 0;
        int indexJ = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(0, 30);
                if (numbers[i][j] > maxValue) {
                    maxValue = numbers[i][j];
                    indexI = i;
                    indexJ = j;
                }
                //maxValue = Math.max(numbers[i][j], maxValue);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Max value: " + maxValue);
        System.out.println("Index[i][j]: [" + indexI + "][" + indexJ + "]");*/

        /*System.out.println("---------------------------------------------");
         *//**
         * Сдвинь элементы массива на 1 позицию вправо, последний элемент переходит в начало.
         *//*
        String[] inputArray = {"A", "B", "C", "D"}; // -> {"D", "A", "B", "C"}
        String lastValue = inputArray[inputArray.length - 1]; //D

        for (int i = inputArray.length - 1; i > 0; i--) {
            inputArray[i] = inputArray[i - 1];
        }
        inputArray[0] = lastValue;

        System.out.println(Arrays.toString(inputArray));
        System.out.println("---------------------------------------------");*/

        /**
         * Удалить элемент по значению. Удали первое вхождение заданного значения из массива.
         * Верни новый массив без него.
         *//*
        String[] inputArray = {"A", "B", "C", "D", "B"};
        String letter = "D";

        String[] resultArray = new String[inputArray.length - 1];
        int index = 0;
        boolean flag = true;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == letter && flag) {
                flag = false;
                continue;
            }
            resultArray[index++] = inputArray[i];
        }

        System.out.println(Arrays.toString(resultArray));
        System.out.println("---------------------------------------------");*/
        /*        *//**
         * Создай два новых массива: один из положительных, другой из отрицательных чисел исходного.
         *//*
        int[] inputArray = {-1, -5, 0, -4, 3, -2, 0, -5, -6};
        int countPos = 0;
        int countNeg = 0;
        int indexPos = 0;
        int indexNeg = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                countPos++;
            }
            if (inputArray[i] < 0) {
                countNeg++;
            }
        }

        int[] pos = new int[countPos];
        int[] neg = new int[countNeg];

        for (int value : inputArray) {
            if (value == 0) {
                continue;
            }
            if (value > 0) {
                pos[indexPos++] = value;
            } else {
                neg[indexNeg++] = value;
            }
        }

        System.out.println("Положительные: " + Arrays.toString(pos));
        System.out.println("Отрицательные: " + Arrays.toString(neg));
        System.out.println("---------------------------------------------");*/
        /*  *//**
         * Дан двумерный массив int[][] matrix.
         * Нужно найти максимальное значение в каждой строке и вернуть массив максимумов.
         *//*
        int[][] deepArray = {
                {1, 5, 6, 2},
                {7, 1, 52, 6},
                {-1, -5, -6},
                {0, -1, 5}};
        int[] result = new int[deepArray.length];
        int tempValue = Integer.MIN_VALUE;

        for (int i = 0; i < deepArray.length; i++) {
            for (int j = 0; j < deepArray[j].length; j++) {
                if (deepArray[i][j] > tempValue) {
                    tempValue = deepArray[i][j];
                }
            }
            result[i] = tempValue;
            tempValue = Integer.MIN_VALUE;
        }

        System.out.println(Arrays.toString(result));*/


        /** Поиск второго по величине числа. Найди второй наибольший элемент без сортировки.*/


        int[] array = {1, 5, 10, 3, 2, 15};

        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = array[i];
            } else if (array[i] < maxValue && array[i] > secondMaxValue) {
                secondMaxValue = array[i];
            }
        }

        System.out.println(secondMaxValue);

        /*int[][] array = {{1, 2, 3}, {10, 20, 30}, {100, 200, 301}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
