package com.okayde.gof.factorymethod;

public abstract class Creator {
    protected abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.testProduct();
    }
}
