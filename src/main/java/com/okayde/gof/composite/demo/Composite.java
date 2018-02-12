package com.okayde.gof.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childComponents = null;
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println("Composite:" + name);
        if (childComponents != null) {
            preStr += "";
            for (Component c : childComponents) {
                c.printStruct(preStr);
            }
        }
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }
}
