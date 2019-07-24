package com.attunity;

import com.attunity.lesson1.Dog;

import java.util.ArrayList;

/**
 * @author Evgeny Borisov
 */
public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("java");
        list.add(new Dog());
        int x = 1;
        String s = String.valueOf(x);
    }
}
