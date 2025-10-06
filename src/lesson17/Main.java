package lesson17;

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
    }

    static long doSomething(MathFunctionalInterface i, int a, int b) {
        return i.calculate(a, b);
    }
}
