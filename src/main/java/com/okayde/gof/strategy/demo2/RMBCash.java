package com.okayde.gof.strategy.demo2;

public class RMBCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        System.out.println("RMBCash" + context.getUserName() + context.getMoney());
    }
}
