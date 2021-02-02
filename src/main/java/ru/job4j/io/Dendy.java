package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.valueOf(input.nextLine());
            switch (select) {
                case 3:
                    System.out.println("Игра завершена.");
                    run = false;
                    break;
                case 1:
                    System.out.println("Танчики загружаются ... ");
                    break;
                case 2:
                    System.out.println("Супер Марио загружается ... ");
                    break;
                default:
                    System.out.println("Такой игры нет.");
                    break;
            }
            System.out.println();
        }
    }
}