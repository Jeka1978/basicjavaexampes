package com.attunity.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ObjectConfigurator {
    void configure(Object t);

    default void setContext(ApplicationContext context){
    }
}
