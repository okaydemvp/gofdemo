package com.okayde.gof.strategy.demo2;

public class Card2 implements PaymentStrategy {
    private String account = "";

    public Card2(String account) {
        this.account = account;
    }

    @Override
    public void pay(PaymentContext context) {
        System.out.println("Card2" + context.getUserName() + account + context.getMoney());
    }
}
