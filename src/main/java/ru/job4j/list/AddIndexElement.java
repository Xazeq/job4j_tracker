package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        boolean rsl = true;
        if (!check.contains(str)) {
            check.add(index, str);
        }
        if (check.size() == list.size()) {
            rsl = false;
        }
        return rsl;
    }
}
