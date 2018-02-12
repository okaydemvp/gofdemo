package com.okayde.gof.composite.demo;

public class Leaf extends Component {
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println("Leaf:" + name);
    }
}
