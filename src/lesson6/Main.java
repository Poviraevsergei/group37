package lesson6;

public class Main {
    public static void main(String[] args) {
        Car skodaCar = new Car(2016, "Skoda");
        skodaCar.startEngine();
        skodaCar.drive(100);
        skodaCar.driveDifDistance(100, 500, 210);

        String skodaBrand = skodaCar.getBrand();
        skodaCar.plusYear();
        System.out.println(skodaBrand);
    }
}
