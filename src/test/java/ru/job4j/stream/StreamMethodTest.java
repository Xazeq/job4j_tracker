package ru.job4j.stream;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;
public class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals(3, StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}