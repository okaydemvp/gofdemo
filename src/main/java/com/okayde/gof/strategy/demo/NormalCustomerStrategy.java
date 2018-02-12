package com.okayde.gof.strategy.demo;

public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("NormalCustomerStrategy");
        return goodsPrice;
    }
}
