package com.okayde.gof.strategy.demo;

public class Price {
    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}
