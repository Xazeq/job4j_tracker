package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile> profiles = List.of(
                new Profile(new Address("City1", "Street1", 5, 12)),
                new Profile(new Address("City2", "Street2", 2, 16)),
                new Profile(new Address("City3", "Street3", 8, 3))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = List.of(
                new Address("City1", "Street1", 5, 12),
                new Address("City2", "Street2", 2, 16),
                new Address("City3", "Street3", 8, 3)
        );
        assertThat(rsl, is(expected));
    }
}