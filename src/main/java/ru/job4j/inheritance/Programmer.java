package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String[] technologyStack;
    private int experience;


    public Project createProject(Client client, TechnicalTask technicalTask) {
        return new Project();
    }

    public void study(String technology) {
    }
}
