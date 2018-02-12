package com.okayde.gof.state;

public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA" + sampleParameter);
    }
}
