package lesson20;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Countdown countdown = new Countdown();
        //countdown.start(3);

        String adminValue = "ADMIN";
        Role roleFromString = Role.valueOf(adminValue);
        System.out.println(roleFromString.isCanRemoveUsers());
    }
}
