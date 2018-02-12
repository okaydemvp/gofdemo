package com.okayde.gof.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB" + sampleParameter);
    }
}
