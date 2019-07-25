package com.attunity.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private List<Supplier<Animal>> animals = Arrays.asList(
            Dog::new,
            Cat::new


    );


}
