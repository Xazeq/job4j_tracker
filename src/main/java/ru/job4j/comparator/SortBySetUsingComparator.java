package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        Set<String> rsl = new TreeSet<>(Comparator.reverseOrder());
        rsl.addAll(list);
        return rsl;
    }
}
