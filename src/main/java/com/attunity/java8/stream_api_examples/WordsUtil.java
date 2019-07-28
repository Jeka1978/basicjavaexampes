package com.attunity.java8.stream_api_examples;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class WordsUtil {
    @SneakyThrows
    public static long countWords(File file) {
        Stream<String> lines = Files.lines(Paths.get(file.toURI()));

        Stream<String> words = lines.flatMap(s -> Arrays.stream(s.split(" ")));

        return words.count();
    }


    public static void main(String[] args) {
       Stream.of("a", "b", "c")
                .mapToInt(s->s.split(" ").length);
    }













}
