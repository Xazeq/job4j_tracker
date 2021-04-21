package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        for (var s : strings) {
            rsl.computeIfPresent(s, (key, value) -> true);
            rsl.putIfAbsent(s, false);
        }
        return rsl;
    }
}
