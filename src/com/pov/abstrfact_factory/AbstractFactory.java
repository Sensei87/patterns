package com.pov.abstrfact_factory;

import com.pov.factory.Account;

public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Account getAccount(String accountType);

}
