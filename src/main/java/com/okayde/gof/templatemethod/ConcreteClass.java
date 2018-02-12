package com.okayde.gof.templatemethod;

public class ConcreteClass extends AbstractClass {
    @Override
    public void doPrimitiveOperation1() {
        System.out.println("doPrimitiveOperation1");
    }

    @Override
    public void doPrimitiveOperation2() {
        System.out.println("doPrimitiveOperation2");
    }
}
