package lesson6;

class Car {
    String brand;
    int year = 1000;
    boolean isEngineStart;

    //логический блок - отрабатывает до конструктора
    {
        isEngineStart = false;
    }

    //Конструктор(по умолчанию)
    public Car() {
    }

    public Car(int year, String brand) {
        isEngineStart = false;
        this.year = year;
        this.brand = brand;
    }

    void startEngine() {
        if (2025 - year >= 10) {
            System.out.println("Двигатель не запущен");
        } else {
            System.out.println("Двигатель запущен");
        }
        isEngineStart = true;
    }

    void drive(int distance) {
        if (isEngineStart) {
            System.out.println("Автомобиль проехал " + distance + " км");
        } else {
            System.out.println("Запустите двигатель");
        }
    }

    void driveDifDistance(int... distances) {
        for (int dist : distances) {
            System.out.println("Автомобиль проехал " + dist);
        }
    }
}
