package com.okayde.gof.strategy.demo2;

public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        System.out.println("DollarCash" + context.getUserName() + context.getMoney());
    }
}
