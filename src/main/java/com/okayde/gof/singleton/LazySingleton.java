package com.okayde.gof.singleton;

public class LazySingleton {
    private static LazySingleton uniqueInstance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }

    public void singletonOperation() {
        System.out.println("LazySingleton");
    }

    private String singletonData;

    public String getSingletonData() {
        return singletonData;
    }
}
