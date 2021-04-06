package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> leftMap = new HashMap<>();
        addArrayToMap(left.toCharArray(), leftMap);
        Map<Character, Integer> rightMap = new HashMap<>();
        addArrayToMap(right.toCharArray(), rightMap);
        return leftMap.equals(rightMap);
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