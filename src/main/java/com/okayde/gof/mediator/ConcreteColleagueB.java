package com.okayde.gof.mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void someOperation() {
        getMediator().changed(this);
    }
}
