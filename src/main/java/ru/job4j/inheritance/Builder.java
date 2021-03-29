package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int experience;

    public Builder(String name, String surname, String education,
                   int birthday, double salary, String specialization,
                   int experience) {
        super(name, surname, education, birthday, salary, specialization);
        this.experience = experience;
    }

    public Team hireWorkers(GuestWorker[] guestWorkers) {
        return new Team();
    }

    public House buildHouse(GuestWorker guestWorker) {
        return new House();
    }

    public void forceToLearnLanguage(GuestWorker guestWorker) {
    }
}
