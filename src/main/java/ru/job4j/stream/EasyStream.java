package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list = new ArrayList<>();

    public static EasyStream of(List<Integer> source) {
        EasyStream easyStream = new EasyStream();
        easyStream.list.addAll(source);
        return easyStream;
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        EasyStream easyStream = new EasyStream();
        for (var num : list) {
            easyStream.list.add(fun.apply(num));
        }
        return easyStream;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        EasyStream easyStream = new EasyStream();
        for (var num : list) {
            if (fun.test(num)) {
                easyStream.list.add(num);
            }
        }
        return easyStream;
    }

    public List<Integer> collect() {
        return list;
    }
}