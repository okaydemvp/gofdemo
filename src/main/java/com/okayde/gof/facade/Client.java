package com.okayde.gof.facade;

public class Client {
    private Client() {
    }

    public static void run(){
        new Facade().test();
    }
}
