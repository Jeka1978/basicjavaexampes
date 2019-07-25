package com.attunity.heroes;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Hobbit hobbit = new Hobbit();
        Knight knight = new Knight();
        GameManager gameManager = new GameManager();
        gameManager.fight(hobbit,knight);
    }
}
