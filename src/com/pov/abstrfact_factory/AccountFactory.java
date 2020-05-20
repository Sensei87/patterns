package com.pov.abstrfact_factory;

import com.pov.factory.Account;
import com.pov.factory.CurrentAccount;
import com.pov.factory.SavingAccount;

public class AccountFactory extends AbstractFactory {

    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    @Override
    Bank getBank(String bankName) {
        return null;
    }

    // Получаем объект указанного типа счета с помощью метода getAccount
    // Это фабричный метод для создания объектов указанного типа счета
    @Override
    Account getAccount(String accountType) {
        if(CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        }
        else if(SAVING_ACCOUNT.equals(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
