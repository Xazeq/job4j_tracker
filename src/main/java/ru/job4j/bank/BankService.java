package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер пасспорта пользователя
     * @return возвращает найденного пользователя или null,
     * если пользователь не найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport номер пасспорта пользователя
     * @param requisite реквизиты счета пользователя
     * @return возвращает найденный счет или null,
     * если пользователь или счет не найдены
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
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
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
