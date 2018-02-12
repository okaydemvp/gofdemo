package com.okayde.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childComponents = null;

    @Override
    public void someOperation() {
        if (childComponents != null) {
            for (Component c : childComponents) {
                c.someOperation();
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

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (childComponents != null) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }
}
