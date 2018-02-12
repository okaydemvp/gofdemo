package com.okayde.gof.mediator.demo2;

public class Dep {
    private String depId;
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public boolean deleteDep() {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }
}
