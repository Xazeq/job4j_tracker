package ru.job4j.tracker;

public class ShowItemsAction implements UserAction{
    private final Output out;

    public ShowItemsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "List of Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== List of Items ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}