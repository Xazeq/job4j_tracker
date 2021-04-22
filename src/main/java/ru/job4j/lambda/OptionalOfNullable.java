package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.ofNullable(value);
        if (strings.contains(value)) {
            return rsl;
        }
        return Optional.empty();
    }
}
