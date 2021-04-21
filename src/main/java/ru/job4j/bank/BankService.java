package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы
 * @author NIKITA SHEVELEV
 * @version 1.0
 */
public class BankService {
    /** Поле содержит всех пользователей системы с привязанными к ним счетами */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     * @param user пользователь, который добавляется в систему
     */
    public void  addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет пользователю
     * @param passport паспортные данные пользователя, по которыем происходит его поиск
     * @param account счет, который будет добавлен пользователю
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер пасспорта пользователя
     * @return возвращает найденного пользователя или null,
     * если пользователь не найден
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport номер пасспорта пользователя
     * @param requisite реквизиты счета пользователя
     * @return возвращает найденный счет или null,
     * если пользователь или счет не найдены
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт
     * @param srcPassport номер пасспорта пользователя от которого переводятся деньги
     * @param srcRequisite реквизиты счета пользователя от которого переводятся деньги
     * @param destPassport номер пасспорта пользователя которому переводятся деньги
     * @param destRequisite реквизиты счета пользователя которому переводятся деньги
     * @param amount сумма для перревода
     * @return возврящает true, если перевод осуществлен успешно
     * или false, если перевод не был осуществлен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
