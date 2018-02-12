package com.okayde.gof.observer.demo;

public class NewSubject extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
