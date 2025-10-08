package lesson17;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Для работы с лямбдами:
        //1. Создать/использовать функциональный интерфейс
        //2. Описать логику Лямбды в main
        MathFunctionalInterface summaLogic = (x, y) -> x + y;
        MathFunctionalInterface mulLogic = (x, y) -> x * y;

        MathFunctionalInterface sumAndSq = (first, second) -> {
            int sum = first + second;
            long sq = (long) Math.pow(sum, 2);
            return sq;
        };

        int a = 10;
        int b = 5;

        //Используем лямбда выражения
        System.out.println(doSomething(sumAndSq, a, b));
        System.out.println(doSomething(mulLogic, a, b));

        //Predicate - принимает параметр, возвращает boolean
        //Function - преобразует один тип в другой
        //Consumer - принимает параметр, ничего не возвращает
        //Supplier - нет входных параметров. но возвращает значение
        UnaryOperator<Integer> plusOne = i -> ++i;
        BinaryOperator<Integer> convertSum = (x, y) -> x + y;
        BiFunction<Integer, Double, String> sumToString = (x, y) -> String.valueOf(x + y);
        System.out.println(sumToString.apply(5, 10.0));
    }

    static long doSomething(MathFunctionalInterface i, int a, int b) {
        return i.calculate(a, b);
    }
}
