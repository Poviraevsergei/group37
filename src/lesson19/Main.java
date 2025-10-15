package lesson19;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 3; i++) {
            PlusOneThread plusOneThread = new PlusOneThread(counter);
            plusOneThread.start();
        }

        Thread.sleep(2000);
        System.out.println(counter.count); //300 000
    }
}
