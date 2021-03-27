package ru.job4j.tracker;

import java.util.Comparator;

public class SortsDescending implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return second.getId() - first.getId();
    }
}
