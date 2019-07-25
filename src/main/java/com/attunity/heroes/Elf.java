package com.attunity.heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character character) {
        if (getPower() > character.getPower()) {
            character.setHp(0);
        }else {
            character.changePower(-1);
        }
    }
}
