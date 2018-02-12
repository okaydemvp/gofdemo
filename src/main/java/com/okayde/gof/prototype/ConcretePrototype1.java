package com.okayde.gof.prototype;

public class ConcretePrototype1 implements Prototype {
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
