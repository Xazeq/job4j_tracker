package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return Stream.iterate(it, Iterator::hasNext, el -> el)
                .map(Iterator::next)
                .flatMap(subIt ->
                        Stream.iterate(subIt, Iterator::hasNext, subEl -> subEl))
                .map(Iterator::next)
                .collect(Collectors.toList());
    }
}