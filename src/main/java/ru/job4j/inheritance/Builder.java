package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int experience;

    public Team hireWorkers(GuestWorker[] guestWorkers) {
        return new Team();
    }

    public House buildHouse(GuestWorker guestWorker) {
        return new House();
    }

    public void forceToLearnLanguage(GuestWorker guestWorker) {
    }
}
