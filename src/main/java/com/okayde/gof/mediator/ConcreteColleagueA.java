package com.okayde.gof.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation(){
        getMediator().changed(this);
    }
}
