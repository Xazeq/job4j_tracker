package ru.job4j.tracker;

import java.util.Comparator;

public class SortsAscending implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getId() - second.getId();
    }
}
