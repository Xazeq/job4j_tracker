package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passenger(int numberOfPassenger) {
        System.out.println("В автобусе " + numberOfPassenger + " пассажиров");
    }

    @Override
    public double fill(double fuel) {
        double priceForOneLiter = 45.25;
        return fuel * priceForOneLiter;
    }
}