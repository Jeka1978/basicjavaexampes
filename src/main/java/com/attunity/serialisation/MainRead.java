package com.attunity.serialisation;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainRead {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\data.obj");

        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fos);
        Human human = (Human) ois.readObject();
        System.out.println(human);
    }
}
