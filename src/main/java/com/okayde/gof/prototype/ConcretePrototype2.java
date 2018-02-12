package com.okayde.gof.prototype;

public class ConcretePrototype2 implements Prototype {
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
