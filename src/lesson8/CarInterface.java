package lesson8;

import java.io.Serializable;

public interface CarInterface extends Cloneable {
    int VAR = 10;

    //абстрактный метод
    public void startEngine();

    void letsGo();

    default void printVar() {
        System.out.println(VAR);
        privateExample();
    }

    private void privateExample() {
        System.out.println("This is private method");
    }

    static void helloStatic() {
        System.out.println("This is static");
    }
}
