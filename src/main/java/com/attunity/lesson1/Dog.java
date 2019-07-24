package com.attunity.lesson1;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    public void bringStick() {
        System.out.println("this is your stick!");
    }

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
