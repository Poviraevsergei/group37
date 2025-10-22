package lesson19.sync;

public class Counter {
    public static int count;

    public void dropCounter(Counter counter){
        synchronized (counter){
            counter.count = 0;
        }
    }

    public static synchronized void plusOne(){
        count++;
    }
}
