package lesson8;

public class Audi implements CarInterface{
    @Override
    public void startEngine() {
        System.out.println("Audi start engine");
    }

    @Override
    public void letsGo() {
        System.out.println("Audi lets go");
    }
}
