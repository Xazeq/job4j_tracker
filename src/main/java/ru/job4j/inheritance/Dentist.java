package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int numberOfDrills;

    public Dentist(String name, String surname, String education, int birthday, double salary, String specialization, int numberOfDrills) {
        super(name, surname, education, birthday, salary, specialization);
        this.numberOfDrills = numberOfDrills;
    }

    public void removeTooth (Pacient pacient) {}

    public void whitenTeeth (Pacient pacient) {}
}
