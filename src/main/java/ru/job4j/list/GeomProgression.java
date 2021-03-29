package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 0;
        List<Integer> list = new ArrayList<>(count);
        list.add(first);
        for (int i = 1; i <= count; i++) {
            double temp = Math.pow(first * denominator, i - 1);
            list.add((int) temp);
            sum += temp;
        }
        return sum;
    }
}
