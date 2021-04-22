package ru.job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = System.out::println;
        Consumer<String> ln = s -> System.lineSeparator();
        return print.andThen(ln);
    }
}
