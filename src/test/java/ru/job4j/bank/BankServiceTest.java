package ru.job4j.bank;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void whenEnterInvalidRequisite() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("3434", "556"));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void whenAddSameAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("5546", 100D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void whenTransferMoneyBetweenAccounts() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546",
                user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance(), is(0D));
    }

    @Test
    public void whenTransferMoneyBetweenUsers() {
        User user = new User("1111", "Ivan Ivanov");
        User user2 = new User("2222", "Petr Petrov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user2);
        bank.addAccount(user.getPassport(), new Account("1212", 200D));
        bank.addAccount(user2.getPassport(), new Account("1313", 100D));
        bank.transferMoney(user.getPassport(), "1212",
                user2.getPassport(), "1313", 50D);
        assertThat(bank.findByRequisite(user.getPassport(), "1212").getBalance(), is(150D));
        assertThat(bank.findByRequisite(user2.getPassport(), "1313").getBalance(), is(150D));
    }

    @Test
    public void whenAmountMoreBalance() {
        User user = new User("1111", "Ivan Ivanov");
        User user2 = new User("2222", "Petr Petrov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user2);
        bank.addAccount(user.getPassport(), new Account("1212", 200D));
        bank.addAccount(user2.getPassport(), new Account("1313", 100D));
        bank.transferMoney(user.getPassport(), "1212",
                user2.getPassport(), "1313", 500D);
        assertThat(bank.findByRequisite(user.getPassport(), "1212").getBalance(), is(200D));
        assertThat(bank.findByRequisite(user2.getPassport(), "1313").getBalance(), is(100D));
    }
}