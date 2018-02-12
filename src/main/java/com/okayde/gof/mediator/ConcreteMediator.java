package com.okayde.gof.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void changed(Colleague colleague) {

    }

    public void setConcreteColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
