package ru.job4j.poly2;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Поезд набирает скорость");
    }
}
