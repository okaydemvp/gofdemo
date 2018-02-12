package com.okayde.gof.composite.demo;

public abstract class Component {
    public abstract void printStruct(String preStr);

    public void addChild(Component child) {
        throw new UnsupportedOperationException("");
    }

    public void removeChild(Component child) {
        throw new UnsupportedOperationException("");
    }

    public Component getChildren(int index) {
        throw new UnsupportedOperationException("");
    }
}
