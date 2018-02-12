package com.okayde.gof.abstractfactory;

public class Client {
    public static void run(){
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.createProductA().operation();
        abstractFactory.createProductB().operation();
    }
}
