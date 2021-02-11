package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction{
    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Item with this id not found");
        }
        return true;
    }
}
