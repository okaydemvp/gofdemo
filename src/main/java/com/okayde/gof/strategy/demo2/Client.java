package com.okayde.gof.strategy.demo2;

public class Client {
    public static void run() {
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();
        PaymentStrategy strategyCard = new Card();
        PaymentStrategy strategyCard2 = new Card2("122222");

        PaymentContext context1 = new PaymentContext("context1", 5000, strategyRMB);
        context1.payNow();
        PaymentContext context2 = new PaymentContext("context2", 5000, strategyDollar);
        context2.payNow();

        PaymentContext context3 = new PaymentContext2("context3", 5000, strategyCard, "111111111");
        context3.payNow();

        PaymentContext context4 = new PaymentContext("context2", 5000, strategyCard2);
        context4.payNow();
    }
}
