package com.attunity.my_spring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        T t = type.newInstance();

        //type.getDeclaredFields()

//      field.getAnnotation(InjectRandomInt.class)
        //field.setAccessible(true)
        //field.set(t,value)

//todo add support for @InjectRandomInt


        return t;
    }


}










