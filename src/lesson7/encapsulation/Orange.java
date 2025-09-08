package lesson7.encapsulation;

public class Orange {
    //Модификаторы доступа:
    // public - доступен везде
    // public String color;

    //protected - доступен в пределах пакета, и в наследниках
    //protected String color;

    // default - доступен в пределах пакета(папки)
    // String color;

    // private - доступен в пределах класса
    private String color;

    //getter - метод который возвращает поле
    public String getColor() {
        return color;
    }

    //setter - метод записывает в поле
    public void setColor(String color){
        this.color = color;
    }

    public void showMeYourColor() {
        System.out.println(color);
    }
}
