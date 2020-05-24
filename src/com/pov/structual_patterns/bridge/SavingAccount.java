package com.pov.structual_patterns.bridge;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("It is a Saving Account");

    }
}
