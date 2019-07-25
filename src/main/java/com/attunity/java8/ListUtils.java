package com.attunity.java8;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay,Action<T> action) {
        for (T t : list) {
            action.doAction(t);
            Thread.sleep(delay);
        }

    }

    public static <T> int countDuplicates(T t, List<T> list,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.myEquals(t1,t)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        ListUtils.forEachWithDelay(integers,500,x -> System.out.println(x) );
    }

















}
