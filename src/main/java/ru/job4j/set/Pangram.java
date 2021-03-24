package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        boolean rsl = true;
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                characters.add(s.charAt(i));
            }
        }
        if (characters.size() != 26) {
            rsl = false;
        }
        return rsl;
    }
}
