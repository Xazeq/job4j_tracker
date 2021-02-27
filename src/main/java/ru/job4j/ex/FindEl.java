package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String s : value) {
            rsl++;
            if (s.equals(key)) {
                return rsl;
            }
        }
        throw new ElementNotFoundException("Array doesn't contain key");
    }

    public static void main(String[] args) {
        String[] array = {"Vasya", "Petr", "Lena", "Katya", "Ivan"};
        String key = "Petr!!!";
        try {
            System.out.println(indexOf(array, key));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
