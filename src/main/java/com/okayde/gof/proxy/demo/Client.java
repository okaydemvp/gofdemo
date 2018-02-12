package com.okayde.gof.proxy.demo;

public class Client {
    public static void run() {
        Person person = (Person) new HomeProxy().getInstance(new Mastor());
        person.searchHouse();
    }
}
