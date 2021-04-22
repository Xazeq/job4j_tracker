package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        Optional<Integer> opt = max(data);
        opt.ifPresent((o) -> System.out.println("Max: " + o));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length <= 0) {
            return Optional.empty();
        }
        int max = 0;
        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }
        return Optional.of(max);
    }
}
