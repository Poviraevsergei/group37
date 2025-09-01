package lesson6;

public class Main {
    public static void main(String[] args) {
        Car skodaCar = new Car(2016, "Skoda");
        skodaCar.startEngine();
        skodaCar.drive(100);
        skodaCar.driveDifDistance(100, 500, 210);
        System.out.println(skodaCar.year);
    }
}
