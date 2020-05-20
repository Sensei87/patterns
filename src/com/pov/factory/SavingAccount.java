package com.pov.factory;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Saving account");
    }
}
