package com.okayde.gof.strategy.demo;

public class Client {
    public static void run() {
        Strategy strategy = new LargeCustomerStrategy();
        Price ctx = new Price(strategy);

        double quote = ctx.quote(1000);
        System.out.println(quote);
    }
}
