package com.okayde.gof.observer.demo;

public class Reader implements Observer {
    private String name;

    @Override
    public void update(Subject subject) {
        String content = ((NewSubject) subject).getContent();
        System.out.println(name + content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
