package lesson6.Task2;

import java.security.InvalidParameterException;

public class Elevator {
    int currentFloor = 1;

    void goUp() {
        if (currentFloor >= 10) {
            System.out.println("Это последний этаж, выше нельзя ...");
            throw new InvalidParameterException("Вы сломали лифт");
        }
        currentFloor++;
        System.out.println("Этаж : " + currentFloor);
    }

    void goDown() {
        if (currentFloor <= 1) {
            System.out.println("Ниже нельзя ...");
            throw new InvalidParameterException("Вы сломали лифт");
        }
        currentFloor--;
        System.out.println("Этаж : " + currentFloor);
    }

    void goToFloor(int floor) {
        if (floor > 0 && floor < 11) {
            currentFloor = floor;
            System.out.println("Этаж : " + currentFloor);
        }
    }
}
