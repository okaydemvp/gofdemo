package com.okayde.gof.command;

public class Client {
    public static void run() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.runCommand();
    }
}
