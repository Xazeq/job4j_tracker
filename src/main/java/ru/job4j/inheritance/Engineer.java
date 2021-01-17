package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String specialization;

    public Engineer(String name, String surname, String education, int birthday, double salary, String specialization) {
        super(name, surname, education, birthday, salary);
        this.specialization = specialization;
    }

    public Project developProject(Client client, TechnicalTask technicalTask) {
        return new Project();
    }
}
