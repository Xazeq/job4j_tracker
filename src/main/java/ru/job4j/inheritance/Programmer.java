package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String[] technologyStack;

    public Programmer(String name, String surname,
                      String education, int birthday,
                      double salary, String specialization,
                      String[] technologyStack) {
        super(name, surname, education, birthday, salary, specialization);
        this.technologyStack = technologyStack;
    }

    public Project createProject(Client client, TechnicalTask technicalTask) {
        return new Project();
    }

    public void study(String technology) {
    }
}
