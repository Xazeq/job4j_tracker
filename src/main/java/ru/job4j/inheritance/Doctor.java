package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Diagnosis inspection (Pacient pacient) {
        return new Diagnosis();
    }

    public boolean heal (Pacient pacient) {
        return true;
    }

    public Diagnosis changeDiagnosis (Pacient pacient) {
        return new Diagnosis();
    }
}
