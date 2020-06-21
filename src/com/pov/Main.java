package com.pov;

import com.pov.factory.AccountFactory;
import com.pov.prototype.AccountCache;
import com.pov.structual_patterns.adapter.AdvancedPayGateway;
import com.pov.structual_patterns.adapter.AdvancedPaymentGatewayAdapter;
import com.pov.structual_patterns.adapter.PaymentGateway;
import com.pov.structual_patterns.adapter.PaymentGatewayImp;
import com.pov.structual_patterns.bridge.*;
import com.pov.structual_patterns.composite.CompositeBankAccount;
import com.pov.structual_patterns.composite.CurrentAccount;
import com.pov.structual_patterns.decorator.Privilege;
import com.pov.structual_patterns.decorator.SavingAccount;
import com.pov.structual_patterns.decorator.SeniorCitizen;
import com.pov.structual_patterns.facade.BankingServiceFacade;
import com.pov.structual_patterns.facade.BankingServiceFacadeImpl;
import com.pov.structual_patterns.proxy.Account;
import com.pov.structual_patterns.proxy.ProxySavingAccount;

public class Main {

    public static void main(String[] args) {


        // Проверка работы Фабричного метода
     /*

       AccountFactory accountFactory = new AccountFactory();
        // Получаем обьект класса SavingAccount и вызывает его метод accountType();
        Account savingAccount = accountFactory.getAccount("SAVING");

        // Вызываем метод accountType класса SavingAccount
        savingAccount.accountType();

        // Получаем объект класса CurrentAccount и вызываем его метод accountType()
        Account currentAccount = accountFactory.getAccount("CURRENT");
        // Вызываем метод accountType класса CurrentAccount
        currentAccount.accountType();


       // Проверка работы Абстрактной фабрики
        AccountFactory accountFactory = new AccountFactory();
        // Получаем объект класса SavingAccount и вызываем его метод accountType()
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();

        // Получаем объект класса CurrentAccount и вызываем его метод accountType()
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();


      */


     // Проверка работы Прототита Prototype
      //  Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
      //  currentAccount.accountType();

      //  Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();
      //  savingAccount.accountType();


        // Проверка работы Строителя Builder
        /*
        Account account = new Account.AccountBuilder("Saving Account",

                1111L,
                "Vasya Pupkin")
                .balance(2334.3)
                .interest(4.5)
                .type("Saving")
                .build();
        System.out.println(account);
          */

        // ==================================================================
        // Structure Patterns
        // Проверка работы Адаптера Adapter
       /* PaymentGateway paymentGateway = new PaymentGatewayImp();
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = null;
        String mobile2 = null;
        advancedPayGateway.makePayment(mobile1, mobile2);
        */

       // Проверка работы Мост Bridge
        /*
       IciciBank iciciBank = new IciciBank(new CurrentAccount());
       Account current = iciciBank.openAccount();
       current.accountType();
       */

        // Проверка работы Composite
        /*
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();
        compositeBankAccount.add(savingAccount);
        compositeBankAccount.add(currentAccount);
        compositeBankAccount.accountType();

         */

        // Проверка работы Decorator(Wrapper)
        /*
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());
        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());

        Account privilegeCitizenSavingAccount = new SavingAccount();
        privilegeCitizenSavingAccount = new Privilege(privilegeCitizenSavingAccount);
        System.out.println(privilegeCitizenSavingAccount.getTotalBenefits());
           */


        // Проверка работы Facade
/*
        BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();
*/

         // Проверка работы Proxy
        Account account = new ProxySavingAccount();
        account.accountType();

    }
}
