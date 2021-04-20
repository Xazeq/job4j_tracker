package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListToMapTest {

    @Test
    public void whenWithDuplicates() {
        List<Student> list = List.of(
                new Student(70, "Ivanov"),
                new Student(25, "Petrov"),
                new Student(50, "Sidorov"),
                new Student(25, "Petrov"),
                new Student(84, "Titov"),
                new Student(50, "Sidorov")
        );
        Map<String, Student> rsl = ListToMap.convert(list);
        Map<String, Student> expected = Map.of(
                "Ivanov", new Student(70, "Ivanov"),
                "Petrov", new Student(25, "Petrov"),
                "Sidorov", new Student(50, "Sidorov"),
                "Titov", new Student(84, "Titov")
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSameSurname() {
        List<Student> list = List.of(
                new Student(90, "Ivanov"),
                new Student(25, "Petrov"),
                new Student(50, "Sidorov"),
                new Student(84, "Titov"),
                new Student(10, "Ivanov")
        );
        Map<String, Student> rsl = ListToMap.convert(list);
        Map<String, Student> expected = Map.of(
                "Ivanov", new Student(90, "Ivanov"),
                "Petrov", new Student(25, "Petrov"),
                "Sidorov", new Student(50, "Sidorov"),
                "Titov", new Student(84, "Titov")
        );
        assertThat(rsl, is(expected));
    }
}