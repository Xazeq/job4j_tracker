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
        List<Integer> tmp = new ArrayList<>();
        for (var num : list) {
            tmp.add(fun.apply(num));
        }
        return new EasyStream(tmp);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        List<Integer> tmp = new ArrayList<>();
        for (var num : list) {
            if (fun.test(num)) {
                tmp.add(num);
            }
        }
        return new EasyStream(tmp);
    }

    public List<Integer> collect() {
        return List.copyOf(list);
    }
}