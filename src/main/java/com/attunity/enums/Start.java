package com.attunity.enums;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        Person person = new Person();
        person.setStatus(MaritalStatus.MARRIED);


        System.out.println(person.getStatus());
        MaritalStatus status = MaritalStatus.findByDbCode(3);
        status.getHandler().handle();
        System.out.println("status = " + status.getHebrewDecs());


    }
}
