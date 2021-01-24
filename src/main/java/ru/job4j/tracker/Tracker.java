package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[index] = item;
            }
        }
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                names[count] = item;
                count++;
            }
        }
        names = Arrays.copyOf(names, count);
        return names;
    }
}