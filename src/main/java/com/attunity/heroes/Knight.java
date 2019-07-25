package com.attunity.heroes;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Knight extends Character {
    public Knight() {
        super(new Range(2,12), new Range(2,12));
    }

    @Setter
    private Weapon weapon = new Sword();

    @Override
    public void kick(Character character) {
       weapon.kick(this,character);
    }
}
