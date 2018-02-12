package com.okayde.gof.iterator.demo;

public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}
