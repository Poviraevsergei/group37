package lesson19.daemon;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread.sleep(100);

        System.out.println("Main finished!");
    }
}
