package ru.job4j.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        s = s.replaceAll("\\s+", "");
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) != ' ') {
                if (!rsl.containsKey(s.charAt(index))) {
                    rsl.put(s.charAt(index), new ArrayList<>(Arrays.asList(index)));
                } else {
                    rsl.get(s.charAt(index)).add(index);
                }
            }
        }
        return rsl;
    }
}