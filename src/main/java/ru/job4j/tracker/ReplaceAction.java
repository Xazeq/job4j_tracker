package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String newItemName = input.askStr("Enter new name: ");
        Item newItem = new Item(newItemName);
        if (tracker.replace(id, newItem)) {
            System.out.println("Item successfully edited!");
        } else {
            System.out.println("Item with this id not found");
        }
        return true;
    }
}
