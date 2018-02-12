package com.okayde.gof.mediator.demo;

public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return data;
    }

    public void readCD() {
        this.data = "CDDriver,CDDriver";
        this.getMediator().change(this);
    }
}
