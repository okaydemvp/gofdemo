package com.okayde.gof.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA");
    }
}
