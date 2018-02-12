package com.okayde.gof.prototype;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        Prototype newPrototy = prototype.clone();
    }
}
