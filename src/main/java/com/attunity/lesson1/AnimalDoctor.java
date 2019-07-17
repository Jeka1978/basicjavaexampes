package com.attunity.lesson1;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {
    public void treatAnimal(Animal animal) {
        Class<? extends Animal> clazz = animal.getClass();

        animal.makeVoice();
    }
}
