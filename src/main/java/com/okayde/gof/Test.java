package com.okayde.gof;

import com.okayde.gof.simplefactory.Client;
import com.okayde.gof.singleton.EnumSingleton;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println("RunTest.......");

        //TestSimpleFactory();
        //TestFacade();
        //TestAdapter();
        //TestSingleton();
        //TestFactoryMethod();
        //TestAbstractFactory();
        //TestPrototype();
        //TestMediator();
        //TestProxy();
        //TestObserver();
        //TestCommand();
        TestComposite();
    }

    public static void TestSimpleFactory() {
        Client.run();

    }

    public static void TestFacade() {
        com.okayde.gof.facade.Client.run();
    }

    public static void TestAdapter() {
        com.okayde.gof.adapter.Client.run();
    }

    public static void TestSingleton() {
        EnumSingleton.uniqueInstance.singletonOperation();
    }

    public static void TestFactoryMethod() {
        com.okayde.gof.factorymethod.Client.run();
    }

    public static void TestAbstractFactory() {
        com.okayde.gof.abstractfactory.Client.run();
    }

    public static void TestPrototype() {
        com.okayde.gof.prototype.demo2.Client.run();
    }

    public static void TestMediator() {
        com.okayde.gof.mediator.demo.Client.run();
    }

    public static void TestProxy(){
        com.okayde.gof.proxy.demo2.Cilent.run();
    }

    public static void TestObserver(){
        com.okayde.gof.observer.demo.Client.run();
    }

    public static void TestCommand(){
        com.okayde.gof.command.demo.Client.run();
    }

    public static void TestComposite(){
        com.okayde.gof.composite.demo.Client.run();
    }
}
