package com.attunity.my_spring;

import lombok.Getter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Evgeny Borisov
 */
public class ApplicationContext {
    private Config config;
    private ObjectFactory objectFactory;
    private Map<Class, Object> cache = new ConcurrentHashMap<>();
    @Getter
    private String packageNames;

    public ApplicationContext(String packageNames) {
        this.packageNames = packageNames;
        this.config = new JavaConfig(packageNames);
        objectFactory = new ObjectFactory(this);
        initAllSingletons();
    }

    private void initAllSingletons() {

    }

    public <T> T getOrCreateBean(Class<T> type) {

        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        if (!cache.containsKey(type)) {
            T t = objectFactory.createObject(type);
            if (type.isAnnotationPresent(Singleton.class)) {
                cache.put(type, t);
            }
            return t;
        }else {
            return (T) cache.get(type);
        }


    }
}













