package com.attunity.heroes;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class King extends Character {
    public King() {
        super(new Range(5,15), new Range(5,15));
    }

    @Setter
    private Weapon weapon = new Sword();

    @Override
    public void kick(Character character) {
       weapon.kick(this,character);
    }
}
