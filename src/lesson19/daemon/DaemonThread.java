package lesson19.daemon;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Daemon:" + i++);
        }
    }
}
