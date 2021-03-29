package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int numberOfOperations;

    public Surgeon(String name, String surname,
                   String education, int birthday,
                   double salary, String specialization,
                   int numberOfOperations) {
        super(name, surname, education, birthday, salary, specialization);
        this.numberOfOperations = numberOfOperations;
    }

    public boolean performAnOperation(Pacient pacient) {
        return true;
    }
}
