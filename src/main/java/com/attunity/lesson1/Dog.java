package com.attunity.lesson1;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
