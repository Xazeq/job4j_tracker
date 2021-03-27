package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenSortsAscending() {
        List<Item> items = Arrays.asList(
                new Item(4),
                new Item(23),
                new Item(1),
                new Item(312),
                new Item(7)
        );
        Collections.sort(items, new SortsAscending());
        List<Item> expected = Arrays.asList(
                new Item(1),
                new Item(4),
                new Item(7),
                new Item(23),
                new Item(312)
        );
        assertThat(expected, is(items));
    }

    @Test
    public void whenSortsDescending() {
        List<Item> items = Arrays.asList(
                new Item(4),
                new Item(23),
                new Item(1),
                new Item(312),
                new Item(7)
        );
        Collections.sort(items, new SortsDescending());
        List<Item> expected = Arrays.asList(
                new Item(312),
                new Item(23),
                new Item(7),
                new Item(4),
                new Item(1)
        );
        assertThat(expected, is(items));
    }
}