package ru.job4j.poly2;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Самелет летит в воздухе");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Самолет набирает скорость");
    }
}
