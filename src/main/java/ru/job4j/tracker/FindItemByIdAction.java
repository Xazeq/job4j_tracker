package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find Item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item with this id not found");
        }
        return true;
    }
}
