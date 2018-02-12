package com.okayde.gof.adapter;

public class Client {
    public static void run() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
