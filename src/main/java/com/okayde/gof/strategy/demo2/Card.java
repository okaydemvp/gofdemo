package com.okayde.gof.strategy.demo2;

public class Card implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        PaymentContext2 paymentContext = (PaymentContext2) context;
        System.out.println("Card" + paymentContext.getUserName() + paymentContext.getAccount() + paymentContext.getMoney());
    }
}
