package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select:");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 0 -> {
                    System.out.println("=== Create a new Item ===");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                }
                case 1 -> {
                    System.out.println("=== List of Items ===");
                    Item[] items = tracker.findAll();
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }
                case 2 -> {
                    System.out.println("=== Edit Item ===");
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new name: ");
                    String newItemName = scanner.nextLine();
                    Item newItem = new Item(newItemName);
                    if (tracker.replace(id, newItem)) {
                        System.out.println("Item successfully edited!");
                    } else {
                        System.out.println("Item with this id not found");
                    }
                }
                case 3 -> {
                    System.out.println("=== Delete Item ===");
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    if (tracker.delete(id)) {
                        System.out.println("Item successfully deleted!");
                    } else {
                        System.out.println("Item with this id not found");
                    }
                }
                case 4 -> {
                    System.out.println("=== Find Item by id ===");
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item with this id not found");
                    }
                }
                case 5 -> {
                    System.out.println("=== Find Items by name ===");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item[] items = tracker.findByName(name);
                    if (items.length > 0) {
                        for (Item item : items) {
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("Item with this name not found");
                    }
                }
                case 6 -> run = false;
                default -> System.out.println("Incorrect choice!");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdDataTimeFormat = item.getCreated().format(formatter);
        System.out.println("Дата и время после форматирования: " + createdDataTimeFormat);
        System.out.println(item);
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}