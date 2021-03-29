package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replace Item ===");
        int id = input.askInt("Enter id: ");
        String newItemName = input.askStr("Enter new name: ");
        Item newItem = new Item(newItemName);
        if (tracker.replace(id, newItem)) {
            out.println("Item successfully replaced!");
        } else {
            out.println("Item with this id not found");
        }
        return true;
    }
}
