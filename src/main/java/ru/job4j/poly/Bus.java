package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
    }

    @Override
    public void passenger(int numberOfPassenger) {
    }

    @Override
    public double fill(double fuel) {
        return 0;
    }
}