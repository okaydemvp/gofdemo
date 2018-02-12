package com.okayde.gof.prototype.demo2;


public interface Prototype {
    Prototype clone();

    String getName();

    void setName(String name);
}
