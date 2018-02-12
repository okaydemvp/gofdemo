package com.okayde.gof.strategy.demo;

public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("OldCustomerStrategy");
        return goodsPrice * (1 - 0.05);
    }
}
