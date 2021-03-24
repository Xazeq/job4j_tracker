package ru.job4j.list;

import java.util.List;

public class SubList {
    public static List<String> getElementBetweenIndexes(List<String> list, String el) {
        List<String> rsl = list.subList(list.indexOf(el), list.lastIndexOf(el));
        return rsl;
    }
}
