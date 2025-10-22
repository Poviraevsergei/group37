package lesson20;

public class Countdown {
    public void start(int i) throws InterruptedException {
        if (i == 0) {
            System.out.println("Запуск ракеты!!!");
            return;
        }
        System.out.println(i + " ...");
        Thread.sleep(1000);
        start(i - 1);
    }
}
