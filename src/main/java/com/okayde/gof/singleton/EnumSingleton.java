package com.okayde.gof.singleton;

public enum EnumSingleton {
    uniqueInstance;

    public void singletonOperation() {
        System.out.println("EnumSingleton");
    }

}
