package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        boolean rsl = true;
        check.add(str);
        if (check.size() == list.size()) {
            rsl = false;
        }
        return rsl;
    }
}
