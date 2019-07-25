package com.attunity.heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends Character {


    public Hobbit() {
        super(0,3);
    }

    @Override
    public void kick(Character character) {
        cry();
    }

    private void cry() {
        System.out.println("I'm crying for dead people and hobbits.");
    }
}





