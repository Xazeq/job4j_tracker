package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void whenQuadraticMatrix() {
        Integer[][] array = {{1, 4, 3}, {6, 4, 2}, {9, 5, 12}};
        List<Integer> rsl = MatrixToList.convert(array);
        List<Integer> expected = List.of(
                1, 4, 3, 6, 4, 2, 9, 5, 12
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenRectangularMatrix() {
        Integer[][] array = {{21, 54, 2, 87, 34}, {93, 126, 432, 1, 0}};
        List<Integer> rsl = MatrixToList.convert(array);
        List<Integer> expected = List.of(
                21, 54, 2, 87, 34, 93, 126, 432, 1, 0
        );
        assertThat(rsl, is(expected));
    }
}