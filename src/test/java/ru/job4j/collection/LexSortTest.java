package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LexSortTest {

    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum12and253and3333() {
        String[] input = {
                "253. Task.",
                "3333. Task.",
                "12. Task."
        };
        String[] out = {
                "12. Task.",
                "253. Task.",
                "3333. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}