package lesson2;

public class WhileForMain {
    public static void main(String[] args) {
/*        int number = 0;
        //Цикл While

        //Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        while (number <= 25) {
            System.out.print(number++ + " ");
        }*/

/*        //Цикла do while
        do {
            System.out.println(number++); //итерация
        } while (number < 10);*/


        //for(инициализация переменных(локальных) ; условие ; действие которое будет повторяться после каждой итерации)
        //Задача 5:
        // Используя for вывести каждое четное число от 2 до 20 включительно. (2 способа)
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // сложность O(n), память.
        for (int i = 2; i <= 20; i = i + 2) {
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }

        //Алгоритм решения задач:
        //1. Задали доп. вопросы.
        //2. Проговорить в слух простое решение
        //3. Написать простое решение
        //4. Дописать улучшения.

        //break - прерывание цикла
        //continue - переход на следующую итерацию

        int i = 1;
        while (true) {
            System.out.println(i++);
        }
    }
}
