package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    //private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    /*public Item[] findAll() {
        //return Arrays.copyOf(items, size);
        return (Item[]) items.toArray();
    }*/

    public List<Item> findAll() {
        return items;
    }

    /*public Item[] findByName(String key) {
        Item[] names = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                names[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(names, count);
    }*/

    public List<Item> findByName(String key) {
        //Item[] names = new Item[size];
        List<Item> names = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (key.equals(item.getName())) {
                names.add(item);
            }
        }
        return names;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
            /*if (items[index].getId() == id) {
                rsl = index;
                break;
            }*/
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            //items[index] = item;
            items.set(index, item);
            return true;
        }
        return false;
    }

    /*public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }*/

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            return true;
        }
        return false;
    }
}