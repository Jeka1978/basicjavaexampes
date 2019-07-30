package com.attunity.my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
class ObjectFactory {

    private List<ObjectConfigurator> configurators = new ArrayList<>();

    private Reflections scanner;


    @SneakyThrows
    ObjectFactory(ApplicationContext context) {
        scanner = new Reflections(context.getPackageNames());
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            ObjectConfigurator configurator = aClass.newInstance();
            configurator.setContext(context);
            configurators.add(configurator);
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        T t = type.newInstance();

        configure(t);


        return t;
    }

    private <T> void configure(T t) {
        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
    }


}










