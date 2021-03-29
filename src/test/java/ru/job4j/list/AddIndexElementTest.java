package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddIndexElementTest {

    @Test
    public void addNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        boolean rsl = AddIndexElement.addNewElement(list, 1, "four");
        assertThat(rsl, is(true));
    }

    @Test
    public void addNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        boolean rsl = AddIndexElement.addNewElement(list, 1, "two");
        assertThat(rsl, is(false));
    }
}