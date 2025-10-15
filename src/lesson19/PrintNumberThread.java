package lesson19;

//1. наследование от Thread
//2. переопределить run()
public class PrintNumberThread extends Thread {
    //TODO: не путать с start()
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Number: " + i);
        }
    }
}
