package lesson19;

import lesson19.sync.Counter;
import lesson19.sync.PlusOneThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            PlusOneThread plusOneThread = new PlusOneThread();
            plusOneThread.start();
        }

        Thread.sleep(2000);
        System.out.println(Counter.count); //300 000
    }
}
