package com.pov.builder;

/*
* Паттерн проектирования «Строитель» (Builder) используется для пошагового
конструирования сложных объектов, возвращая в результате законченный объект.
* Логика и весь процесс создания объекта должны быть обобщенными, чтобы
можно было использовать их для создания различных конкретных реализаций
одного объектного типа. Данный паттерн упрощает конструирование сложных
объектов и скрывает нюансы конструирования объекта от вызывающего клиентского кода.
*  При использовании этого паттерна не забывайте, что процесс должен
быть пошаговым, то есть вы должны разбить логику конструирования объекта на
несколько этапов, в отличие от абстрактной фабрики и фабричного метода, где
объект создается за один шаг.
* */

public class Account {

    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    private Account(AccountBuilder accountBuilder) {
        super();
        this.accountName = accountBuilder.accountName;
        this.accountNumber = accountBuilder.accountNumber;
        this.accountHolder = accountBuilder.accountHolder;
        this.balance = accountBuilder.balance;
        this.type = accountBuilder.type;
        this.interest = accountBuilder.interest;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public static class AccountBuilder {
        private String accountName;
        private Long accountNumber;
        private String accountHolder;
        private double balance;
        private String type;
        private double interest;

        public AccountBuilder(String accountName, Long accountNumber,
                              String accountHolder) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;

        }
        public AccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }
        public AccountBuilder type(String type) {
            this.type = type;
            return this;
        }
        public AccountBuilder interest(double interest) {
            this.interest = interest;
            return this;
        }
        public Account build() {
            Account user = new Account(this);
            return user;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", interest=" + interest +
                '}';
    }
}
