package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;
    private double salary;

    public Profession(String name, String surname, String education, int birthday, double salary) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.salary = salary;
    }

    public Profession(String name, String surname, String education) {
        this(name, surname, education, 0, 0.0);
    }

    public Profession() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public double getSalary() {
        return salary;
    }
}
