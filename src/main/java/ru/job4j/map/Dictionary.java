package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new TreeMap<>();
        for (var s : strings) {
            if (rsl.containsKey(s.substring(0, 1))) {
                rsl.get(s.substring(0, 1)).add(s);
            }
            rsl.putIfAbsent(s.substring(0, 1), new ArrayList<>(Arrays.asList(s)));
        }
        return rsl;
    }
}
