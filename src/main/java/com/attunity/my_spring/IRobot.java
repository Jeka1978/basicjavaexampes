package com.attunity.my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println("I was created");
        System.out.println(speaker.getClass());
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
