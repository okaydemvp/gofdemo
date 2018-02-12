package com.okayde.gof.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject = null;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        realSubject.request();
    }
}
