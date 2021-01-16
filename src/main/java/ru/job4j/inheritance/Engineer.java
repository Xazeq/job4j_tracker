package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specialization;

    public Project developProject(Client client, TechnicalTask technicalTask) {
        return new Project();
    }
}
