package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ivanov@yandex.ru", "Ivanov");
        map.put("petrov@mail.ru", "Petrov");
        map.put("sidorov@yandex.ru", "Sidorov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
