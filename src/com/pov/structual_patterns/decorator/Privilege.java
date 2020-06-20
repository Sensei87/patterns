package com.pov.structual_patterns.decorator;

public class Privilege extends AccountDecorator {
    Account account;

    public Privilege(Account account) {
        this.account = account;
    }

    @Override
    String applyOtherBenefits() {
        return "an accident insurance of up to $1,600 and\n" +
                "an overdraft facility of $84";
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are " + applyOtherBenefits();
    }
}
