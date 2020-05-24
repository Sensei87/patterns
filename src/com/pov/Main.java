package com.pov;

import com.pov.factory.AccountFactory;
import com.pov.prototype.AccountCache;
import com.pov.structual_patterns.adapter.AdvancedPayGateway;
import com.pov.structual_patterns.adapter.AdvancedPaymentGatewayAdapter;
import com.pov.structual_patterns.adapter.PaymentGateway;
import com.pov.structual_patterns.adapter.PaymentGatewayImp;
import com.pov.structual_patterns.bridge.*;

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




    }
}
