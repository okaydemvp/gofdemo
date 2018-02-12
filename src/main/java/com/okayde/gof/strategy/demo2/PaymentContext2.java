package com.okayde.gof.strategy.demo2;

public class PaymentContext2 extends PaymentContext {
    private String account;

    public PaymentContext2(String userName, double money, PaymentStrategy strategy, String account) {
        super(userName, money, strategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
