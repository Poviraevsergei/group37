package lesson19;

public class PlusOneThread extends Thread {

    private Counter counter;

    public PlusOneThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.count++;
        }
        System.out.println(Thread.currentThread() + " finished!" );
    }
}
