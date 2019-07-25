package com.attunity.enums;

/**
 * @author Evgeny Borisov
 */
public class DivorcedHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("dirvorced was handled");
    }
}
