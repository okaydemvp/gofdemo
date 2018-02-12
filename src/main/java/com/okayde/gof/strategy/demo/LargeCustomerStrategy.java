package com.okayde.gof.strategy.demo;

public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("LargeCustomerStrategy");
        return goodsPrice * (1 - 0.1);
    }
}
