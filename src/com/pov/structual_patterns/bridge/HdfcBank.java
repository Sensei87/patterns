package com.pov.structual_patterns.bridge;

public class HdfcBank extends Bank {
    public HdfcBank(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.println("Open your account with HDFC Bank");
        return account;
    }
}
