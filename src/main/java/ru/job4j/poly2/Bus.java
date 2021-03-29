package ru.job4j.poly2;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус едет по дороге");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Автобус набирает скорость");
    }
}
