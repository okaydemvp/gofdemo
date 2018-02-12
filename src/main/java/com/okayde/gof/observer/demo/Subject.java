package com.okayde.gof.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> readers = new ArrayList<>();

    public void attach(Observer observer) {
        readers.add(observer);
    }

    public void detach(Observer observer) {
        readers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : readers) {
            observer.update(this);
        }
    }
}
