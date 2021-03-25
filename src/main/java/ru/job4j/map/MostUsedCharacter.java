package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        int temp = 0;
        Map<Character, Integer> map = new TreeMap<>();
        str = str.toLowerCase();
        str = removeChar(str, ' ');
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i), 1);
            map.computeIfPresent(str.charAt(i), (key, value) -> value + 1);
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if (value > temp) {
                temp = value;
                rsl = key;
            }
        }
        return rsl;
    }

    public static String removeChar(String str, char c) {
        String rsl = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                rsl += str.charAt(i);
            }
        }
        return rsl;
    }
}
