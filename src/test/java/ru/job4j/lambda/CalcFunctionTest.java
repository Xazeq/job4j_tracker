package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CalcFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = CalcFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResult() {
        List<Double> result = CalcFunction.diapason(3, 6, x -> 2 * x * x + 2 * x + 5);
        List<Double> expected = Arrays.asList(29D, 45D, 65D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        List<Double> result = CalcFunction.diapason(2, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}