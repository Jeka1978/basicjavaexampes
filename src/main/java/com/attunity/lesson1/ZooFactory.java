package com.attunity.lesson1;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ZooFactory {
    private Random random = new Random();


    private Reflections scanner = new Reflections("com.attunity.lesson1");
    private ArrayList<Class<? extends Animal>> animalClasses;

    public ZooFactory() {
        Set<Class<? extends Animal>> classes = scanner.getSubTypesOf(Animal.class);
        this.animalClasses = new ArrayList<>();
        for (Class<? extends Animal> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                animalClasses.add(aClass);
            }
        }

    }

    @SneakyThrows
    public Animal createRandomAnimal() {

        Class<? extends Animal> aClass = animalClasses.get(random.nextInt(animalClasses.size()));
        return aClass.newInstance();


    }

    public static void main(String[] args) {
        ZooFactory zooFactory = new ZooFactory();
        for (int i = 0; i < 10; i++) {
            Animal randomAnimal = zooFactory.createRandomAnimal();
            randomAnimal.makeVoice();
        }
    }
}
















