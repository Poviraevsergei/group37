package lesson7.polimorf;

public class Dog extends Animal{
    //Переопределенный метод voice()
    @Override
    public void voice() {
        System.out.println("Gav gav");
    }
}
