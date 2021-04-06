package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        Set<String> originSet = new HashSet<>(Arrays.asList(origin.split("[ .,!:;]")));
        Set<String> lineSet = new HashSet<>(Arrays.asList(line.split("[ .,!:;]")));
        for (String word : lineSet) {
            if (!originSet.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}