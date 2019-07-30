package com.attunity.my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
class ObjectFactory {

    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators = new ArrayList<>();

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
        Set<Class<? extends ProxyConfigurator>> set = scanner.getSubTypesOf(ProxyConfigurator.class);
        for (Class<? extends ProxyConfigurator> aClass : set) {
            proxyConfigurators.add(aClass.newInstance());
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        T t = type.newInstance();

        configure(t);
        invokeInitMethods(type, t);
        t = wrapWithProxyIfNeeded(type, t);


        return t;
    }

    private <T> void invokeInitMethods(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);
            }
        }
    }

    private <T> T wrapWithProxyIfNeeded(Class<T> type, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.configure(t, type);
        }
        return t;
    }

    private <T> void configure(T t) {
        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
    }


}










