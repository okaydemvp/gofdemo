package com.okayde.gof.strategy.demo;

public class CooperateCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("CooperateCustomerStrategy");
        return goodsPrice * (1 - 0.2);
    }
}
