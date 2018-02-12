package com.okayde.gof.factorymethod;

public class ConcreteCreator extends Creator {
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
