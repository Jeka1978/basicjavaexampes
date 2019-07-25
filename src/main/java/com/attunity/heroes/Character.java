package com.attunity.heroes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    public Character(Range powerRange, Range hpRange) {
        power = RandomUtil.getIntInRange(powerRange);
        hp = RandomUtil.getIntInRange(hpRange);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void changeHp(int delta) {
        hp += delta;
    }

    public void changePower(int delta) {
        power += delta;
    }

    public abstract void kick(Character character);

















}
