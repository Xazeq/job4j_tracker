package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String name, String surname,
                  String education, int birthday,
                  double salary, String specialization) {
        super(name, surname, education, birthday, salary);
        this.specialization = specialization;
    }

    public Diagnosis inspection(Pacient pacient) {
        return new Diagnosis();
    }

    public boolean heal(Pacient pacient) {
        return true;
    }

    public Diagnosis changeDiagnosis(Pacient pacient) {
        return new Diagnosis();
    }
}
