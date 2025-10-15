package lesson19;

public class PersonInterfaceThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Новый поток через interface");
    }
}
