package com.okayde.gof.simplefactory;

public class Factory {
    private Factory() {
    }
    public static Api createApi(int condition) {
        Api api = null;
        switch (condition) {
            case 1:
                api = new ImplA();
                break;
            case 2:
                api = new ImplB();
                break;
        }
        return api;
    }
}
