package com.okayde.gof.observer.demo2;

import java.util.Observable;

public class NewsPaper extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(this.content);//push
        //this.notifyObservers();//pull
    }
}
