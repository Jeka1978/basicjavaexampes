package com.attunity.homework;

import com.attunity.immutable.Soldier;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();

        List<String> strings2 = new ArrayList<>();

        StringBuilder text = new StringBuilder();

        for (String arg : args) {
            text.append(arg);
        }

        System.out.println(text.toString().toUpperCase());


    }



}
