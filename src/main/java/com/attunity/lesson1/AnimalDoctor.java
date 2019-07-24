package com.attunity.lesson1;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {
    public void treatAnimal(Animal animal) {

        if (animal instanceof Dog) {
            ((Dog) animal).bringStick();
        }
        animal.makeVoice();
    }
}
