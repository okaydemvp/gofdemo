package com.okayde.gof.builder;

public class ConcreteBuilder implements Builder {
    private Product resultProduct;

    public void buildPart() {
        System.out.println("ConcreteBuilder+Product");
    }

    public Product getResult() {
        return resultProduct;
    }
}
