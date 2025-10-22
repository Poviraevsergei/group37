package lesson19.interrupt;

public class MainIntrrupted {
    public static void main(String[] args) throws InterruptedException {
        //NumberWriter numberWriter = new NumberWriter();
        //numberWriter.start();
        //Thread.sleep(100);
        //System.out.println("Interrupt NumberWriter");
        //numberWriter.interrupt();
        System.out.println(Thread.currentThread().isInterrupted());
        Thread.currentThread().interrupt();
        Thread.interrupted();
        System.out.println(Thread.currentThread().isInterrupted());

        System.out.println(Thread.currentThread().isInterrupted());

    }
}
