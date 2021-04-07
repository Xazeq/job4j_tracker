package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        List<String> firstList = Arrays.asList(first.split("/"));
        List<String> secondList = Arrays.asList(second.split("/"));
        int rsl = secondList.get(0).compareTo(firstList.get(0));
        return rsl == 0 ? first.compareTo(second) : rsl;
    }
}
