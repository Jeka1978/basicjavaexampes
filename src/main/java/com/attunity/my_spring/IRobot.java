package com.attunity.my_spring;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public IRobot() {
        System.out.println("I was created");
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
