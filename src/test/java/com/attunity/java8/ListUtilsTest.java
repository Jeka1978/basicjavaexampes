package com.attunity.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {
        List<String> list = asList("java", "JAVA", "JaVa", "groovy", "kotlin");
        int count = ListUtils.countDuplicates("java", list, (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3,count);

    }
}