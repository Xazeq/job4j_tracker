package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /*public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            if (select >= 0 && select < actions.length) {
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            } else {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
            }
        }
    }*/

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            if (select >= 0 && select < actions.size()) {
                UserAction action = actions.get(select);
                run = action.execute(input, tracker);
            } else {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
            }
        }
    }

    /*private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }*/

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        /*UserAction[] actions = {
                new CreateAction(output),
                new ShowItemsAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindItemByIdAction(output),
                new FindItemsByNameAction(output),
                new ExitAction()
        };*/
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ShowItemsAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindItemByIdAction(output),
                new FindItemsByNameAction(output),
                new ExitAction()
        );
        new StartUI(output).init(input, tracker, actions);
    }
}