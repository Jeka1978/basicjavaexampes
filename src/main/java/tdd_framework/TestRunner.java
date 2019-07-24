package tdd_framework;

import lombok.SneakyThrows;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.io.File;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class TestRunner implements BeanPostProcessor {

    //todo implement method which takes dir name as parameter and run all it's test methods
    //hint use class File


    @SneakyThrows
    public static void runTestsFromClass(String className) {


        Class<?> testClass = Class.forName(className);
        runTest(testClass);
    }


    @SneakyThrows
    public static void runTest(Class testClass) {
        Object o = testClass.newInstance();
        runTest(o);
    }


    @SneakyThrows
    public static void runTest(Object testObject) {

        Class<?> objectClass = testObject.getClass();
        Method[] methods = objectClass.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")||method.isAnnotationPresent(MyTest.class)) {
                method.invoke(testObject);
            }
        }
    }
}
