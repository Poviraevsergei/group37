package lesson1;

class MyFirstClass {
    public static void main(String[] args) {
        // main, psvm, sout
        System.out.println("Hello world!");

        //Типы данных: Примитивные, Ссылочные(Объектные)
        //Примитивные(8)
        //Целочисленные(byte, short, int*, long)
        int age = 10;
        int anotherAge = 10 + age;

        //Дробные, вещественные(float, double*)
        double cost = 11.4;

        //Символьный(char)
        char a = 'a';

        //Логический(boolean)
        boolean isAdult = false;

        int number = 10;
        int secondNumber = 20;
        //арифметические +-*/% --++
        System.out.println(number + secondNumber);
        System.out.println(number - secondNumber);
        System.out.println(number * secondNumber);
        System.out.println(number / secondNumber);
        System.out.println(number % secondNumber);
        System.out.println(++number + 5);
        System.out.println(number);

        //сравнения (результат boolean)
        System.out.println(number > secondNumber);
        System.out.println(number < secondNumber);
        System.out.println(number >= secondNumber);
        System.out.println(number <= secondNumber);
        System.out.println(number == secondNumber);
        System.out.println(number != secondNumber);

        //логические || - или, && - и !
        System.out.println(true || false);

        //Присвоение
        int result = 10;
        result += 20;
        result *= 20;
        result = result + 20;
        System.out.println(result);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
