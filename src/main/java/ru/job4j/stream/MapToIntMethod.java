package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(i -> (int) i)
                .sum();
    }
}
