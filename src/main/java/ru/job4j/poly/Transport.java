package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int numberOfPassenger);

    double fill(double fuel);
}
