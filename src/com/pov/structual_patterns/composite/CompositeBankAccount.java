package com.pov.structual_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account {

    // Коллекция счетов-потомков
    private List<Account> childAccount = new ArrayList<>();


    @Override
    public void accountType() {
        for(Account account : childAccount) {
            account.accountType();
        }
    }

    // Добавляет счет в композицию
    public void add(Account account) {
        childAccount.add(account);
    }

    // Удаляет счет из композиции
    public void remove(Account account) {
        childAccount.remove(account);
    }


}
