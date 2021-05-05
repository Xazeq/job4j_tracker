package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list;

    private EasyStream(List<Integer> list) {
        this.list = list;
    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStream(new ArrayList<>(source));
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        EasyStream easyStream = new EasyStream(new ArrayList<>());
        for (var num : list) {
            easyStream.list.add(fun.apply(num));
        }
        return easyStream;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        EasyStream easyStream = new EasyStream(new ArrayList<>());
        for (var num : list) {
            if (fun.test(num)) {
                easyStream.list.add(num);
            }
        }
        return easyStream;
    }

    public List<Integer> collect() {
        return List.copyOf(list);
    }
}