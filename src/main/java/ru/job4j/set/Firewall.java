package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String rsl = "";
        for (String word : words) {
            if (s.contains(word)) {
                rsl = "Выберите другую статью...";
            } else {
                rsl = "Вы сделали правильный выбор!";
            }
        }
        return rsl;
    }
}
