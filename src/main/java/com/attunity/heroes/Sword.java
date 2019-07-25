package com.attunity.heroes;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public void kick(Character kicker, Character kicked) {
        int damage = RandomUtil.getIntInRange(new Range(0, kicker.getPower()));
        kicked.changeHp(-damage);
    }
}
