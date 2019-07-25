package com.attunity.heroes;

/**
 * @author Evgeny Borisov
 */
public class GameManager {
    public void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1);
            System.out.println(c2);
            c1.kick(c2);
            c2.kick(c1);
        }
        if (c1.isAlive()) {
            System.out.println(c1 + " won");
        } else {
            System.out.println(c2 + "won");
        }
    }
}
