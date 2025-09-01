package lesson6.Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Weapon axe = new Weapon("топор", 20);
        Weapon gun = new Weapon("пистолет", 50);

        Player ilya = new Player(axe, "Илья");
        Player maria = new Player(gun, "Мария");

        Random random = new Random();
        do {
            if (random.nextBoolean()) {
                ilya.attack(maria);
            } else {
                maria.attack(ilya);
            }
        } while (!ilya.isDead && !maria.isDead);
    }
}
