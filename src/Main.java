import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Car car = new Car();
       Class<? extends Car> carInfo = car.getClass();

       System.out.println(carInfo.getName());
       System.out.println(Arrays.toString(carInfo.getInterfaces()));
       System.out.println(Arrays.toString(carInfo.getDeclaredFields()));
    }
}
