package com.okayde.gof.command;

public class ConcreteCommand implements Command {
    private Receiver receiver = null;
    private String state;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
