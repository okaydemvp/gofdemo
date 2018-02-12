package com.okayde.gof.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {
    private String name;

    @Override
    public void update(Observable o, Object arg) {
        //push
        System.out.println(name + arg);
        //pull
        //System.out.println(name + ((NewsPaper) o).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
