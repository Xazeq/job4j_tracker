package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> map = new HashMap<>();
        addArrayToMap(left.toCharArray(), map);
        for (char c : right.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else if (map.containsKey(c) && map.get(c) == 1) {
                map.remove(c);
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return map.isEmpty();
    }

    private static void addArrayToMap(char[] array, Map<Character, Integer> map) {
        for (char c : array) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
    }
}