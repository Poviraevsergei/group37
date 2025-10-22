package lesson19.sync;

public class PlusOneThread extends Thread {

    public PlusOneThread() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Counter.plusOne();
        }
        System.out.println(Thread.currentThread() + " finished!");
    }
}

//Синхронизированный блок/метод

