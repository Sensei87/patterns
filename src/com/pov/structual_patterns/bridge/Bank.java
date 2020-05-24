package com.pov.structual_patterns.bridge;

public abstract class Bank {

    // Composition
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}
