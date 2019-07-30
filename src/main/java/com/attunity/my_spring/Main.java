package com.attunity.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext("com.attunity");
        IRobot iRobot = context.getOrCreateBean(IRobot.class);
        context.getOrCreateBean(IRobot.class);
        context.getOrCreateBean(IRobot.class);
        context.getOrCreateBean(IRobot.class);
        iRobot.cleanRoom();
    }
}
