package com.attunity.memory;

import com.github.javafaker.Faker;
import com.github.javafaker.GameOfThrones;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        GameOfThrones thrones = new Faker().gameOfThrones();
        while (true) {
            Random random = new Random();
            String character = thrones.character()+strings.size();
            if (random.nextInt(1000)==1) {
                System.out.println(character);
                strings.add(character);
            }
        }
    }





}
