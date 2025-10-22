package lesson19.interrupt;

public class NumberWriter extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(isInterrupted() + "value: " + ++i);

        }
    }
}

