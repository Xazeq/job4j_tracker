package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqModel() {
        License first = new License();
        first.setModel("Toyota");
        License second = new License();
        second.setModel("Toyota");
        assertThat(first, is(second));
    }
}