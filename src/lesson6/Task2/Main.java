package lesson6.Task2;

/**
 * * Класс Elevator, с полем currentFloor, и методами goUp(), goDown(), goToFloor(int floor).
 * * Добавь проверку: не подниматься выше 10 этажа и не опускаться ниже 1.
 */
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.goToFloor(2);
        elevator.goDown();
        elevator.goDown();
        elevator.goDown();
        elevator.goDown();
        elevator.goDown();
    }
}
