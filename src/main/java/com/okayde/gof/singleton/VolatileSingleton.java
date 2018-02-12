package com.okayde.gof.singleton;

public class VolatileSingleton {
    private volatile static VolatileSingleton instance = null;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleton.class) {
                if (instance == null) {
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }
}
