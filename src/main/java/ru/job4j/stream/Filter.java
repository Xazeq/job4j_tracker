package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, -2, 45, 12, 32, -5,
                -78, 43, 5453, 12, -6, -111, 21);
        List<Integer> filteredList = list.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
    }
}