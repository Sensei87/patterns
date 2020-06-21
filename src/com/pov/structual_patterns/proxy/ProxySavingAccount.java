package com.pov.structual_patterns.proxy;

public class ProxySavingAccount implements Account {
    private Account savingAccount;

    @Override
    public void accountType() {
        if(savingAccount == null) {
            savingAccount = new SavingAccount();
        }
        savingAccount.accountType();
    }

}
