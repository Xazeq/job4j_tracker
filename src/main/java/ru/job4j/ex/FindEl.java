package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Array doesn't contain key");
        }
        return rsl;
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
