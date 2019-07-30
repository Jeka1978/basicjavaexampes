package com.attunity.my_spring;

import lombok.Setter;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {

    @Setter
    private ApplicationContext context;


    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        for (Field field : type.getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object object = context.getOrCreateBean(field.getType());
                field.setAccessible(true);
                field.set(t, object);
            }
        }
    }
}
