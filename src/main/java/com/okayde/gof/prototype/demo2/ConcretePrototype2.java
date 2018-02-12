package com.okayde.gof.prototype.demo2;

public class ConcretePrototype2 implements Prototype {
    private String name;

    public Prototype clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
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
        return "Now in Prototype2,name" + name;
    }
}
