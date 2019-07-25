package com.attunity.enums;

/**
 * @author Evgeny Borisov
 */
public class SingleHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("single was handled");
    }
}
