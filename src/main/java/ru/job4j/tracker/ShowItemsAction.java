package ru.job4j.tracker;

public class ShowItemsAction implements UserAction{
    @Override
    public String name() {
        return "=== List of Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}