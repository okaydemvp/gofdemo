package com.okayde.gof.strategy.demo3;

public class DbLog implements LogStrategy {
    @Override
    public void log(String msg) {
        System.out.println("DbLog" + msg);
    }
}
