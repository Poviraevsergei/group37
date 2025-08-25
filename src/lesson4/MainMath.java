package lesson4;

public class MainMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        //Методы класса Math
        System.out.println(Math.max(10, 2)); //максимальное значение
        System.out.println(Math.min(10, 2)); //минимальное значение
        System.out.println(Math.abs(-20)); //модуль

        System.out.println(Math.ceil(1.01)); // округление вверх
        System.out.println(Math.round(1.4)); // округление обычное
        System.out.println(Math.floor(1.99)); // округление вниз

        System.out.println(Math.sqrt(16)); //квадратный корень
        System.out.println(Math.pow(10, 5)); //в степень
        System.out.println(Math.multiplyExact(5, 2)); //умножение
        System.out.println(Math.divideExact(10, 2)); //деление
        System.out.println(Math.incrementExact(11)); //добавляет 1
        System.out.println(Math.decrementExact(11)); //отнимает 1

        System.out.println(Math.random()); //генерирует псевдослучайные значения
    }
}
