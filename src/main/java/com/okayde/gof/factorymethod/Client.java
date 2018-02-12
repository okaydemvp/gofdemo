package com.okayde.gof.factorymethod;

public class Client {
    public static void run() {
        Creator creator = new ConcreteCreator();
        creator.someOperation();
    }
}
