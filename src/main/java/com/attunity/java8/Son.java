package com.attunity.java8;

/**
 * @author Evgeny Borisov
 */
public class Son implements Father,Mother {
    @Override
    public void talk() {
        Mother.super.talk();
        Father.super.talk();
    }
}
