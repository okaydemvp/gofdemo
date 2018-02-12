package com.okayde.gof.singleton;

public class HungerSingleton {
    private static HungerSingleton uniqueInstance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return uniqueInstance;
    }

    public void singletonOperation() {
        System.out.println("HungerSingleton");
    }

    private String singletonData;

    public String getSingletonData() {
        return singletonData;
    }
}
