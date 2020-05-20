package com.pov.abstrfact_factory;

import com.pov.factory.Account;

public class BankFactory extends AbstractFactory {

    final String ICICI_BANK = "ICICI";
    final String YES_BANK = "YES";

    // Получаем объект указанного банка с помощью метода getBank
    // Это фабричный метод для создания объекта указанного банка
    @Override
    Bank getBank(String bankName) {
        if(ICICI_BANK.equalsIgnoreCase(bankName)) {
            return new ICICIBank();
        }
        else if (YES_BANK.equalsIgnoreCase(bankName)) {
            return new YesBank();
        }
        return null;
    }

    @Override
    Account getAccount(String accountType) {
        return null;
    }
}
