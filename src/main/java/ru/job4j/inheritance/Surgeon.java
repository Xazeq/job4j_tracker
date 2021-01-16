package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int numberOfOperations;

    public boolean performAnOperation (Pacient pacient) {
        return true;
    }
}
