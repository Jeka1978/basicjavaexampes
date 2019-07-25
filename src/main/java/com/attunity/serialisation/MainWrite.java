package com.attunity.serialisation;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainWrite {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\data.obj");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Human(18,"Nancy"));
    }
}
