package com.okayde.gof.strategy;

public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInstatnce() {
        strategy.algorithmInterface();
    }
}
