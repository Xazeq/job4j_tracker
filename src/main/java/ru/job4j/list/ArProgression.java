package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = data.get(0) + data.get(data.size() - 1);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i).equals(((data.get(i - 1)) + data.get(i + 1)) / 2)) {
                rsl += data.get(i);
            } else {
                rsl = 0;
                break;
            }
        }
        return rsl;
    }
}
