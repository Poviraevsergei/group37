package lesson8;

public class Car implements CarInterface{

    public void startEngine() {
        System.out.println("я стартую");
    }


    public void letsGo() {
        System.out.println("Я еду");
    }

    String brand;
    int maxSpeed;

    static final int count; //кол-во созданных машин

    //статический блок - отрабатывает один раз при первом обращении к классу
    static {
        System.out.println("static block");
        count = 2;
    }

    {

    }


    public Car() {

    }

    //статический метод принадлежит классу а не объектам!
    //Статический контекст не может содержать не статические поля/методы
    public static void showMeStaticInfo() {
        System.out.println("Count:" + count);
        //  System.out.println("MaxSpeed:" + maxSpeed);
        //  System.out.println("Brand:" + brand);
    }
}
