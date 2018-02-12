package com.okayde.gof.prototype.demo2;

public class ConcretePrototype1 implements Prototype {
    private String name;

    public Prototype clone() {
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Now in Prototype1,name=" + name;
    }
}
