package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void whenWithoutDuplicates() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Set.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenWithDuplicates() {
        List<Account> accounts = List.of(
                new Account("1234567890", "Ivan Ivanov", "54334"),
                new Account("1020304050", "Petr Petrov", "50001"),
                new Account("1234567890", "Ivan Ivanov", "54334")
        );
        HashSet<Account> expect = new HashSet<>(
                Set.of(
                        new Account("1234567890", "Ivan Ivanov", "54334"),
                        new Account("1020304050", "Petr Petrov", "50001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}