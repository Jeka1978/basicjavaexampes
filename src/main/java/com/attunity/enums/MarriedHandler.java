package com.attunity.enums;

/**
 * @author Evgeny Borisov
 */
public class MarriedHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("married was handled");
    }
}
