package lesson6.Task1;

import java.util.Random;

public class Player {
    double health = 100.0;
    Weapon weapon;
    String playerName;
    boolean isDead = false;

    public Player(Weapon weapon, String playerName) {
        this.weapon = weapon;
        this.playerName = playerName;
    }

    void attack(Player player) {
        double damage = new Random().nextInt(0, weapon.damage);
        System.out.println("Игрок " + playerName + " атакует используя " + weapon.weaponName +
                ", нанося " + damage + " урона.");
        player.health = player.health - damage;
        System.out.println("У " + player.playerName + " осталось " + player.health);
        if (player.health <= 0) {
            System.out.println(player.playerName + " dead...");
            isDead = true;
        }
    }
}
