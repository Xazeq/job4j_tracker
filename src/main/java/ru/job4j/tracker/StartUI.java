package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdDataTimeFormat = item.getCreated().format(formatter);
        System.out.println("Дата и время после форматирования: " + createdDataTimeFormat);
    }
}
