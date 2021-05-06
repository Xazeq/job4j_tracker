package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    public static boolean valid(char[] data) {
        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        int countLeft = 0;
        int countRight = 0;
        for (char c : data) {
            if (c == '(') {
                left.add(c);
                countLeft++;
            } else {
                right.add(c);
                countRight++;
            }
            if (countRight > countLeft) {
                return false;
            }
        }
        return left.size() == right.size();
    }
}
