package com.okayde.gof.strategy.demo3;

public class FileLog implements LogStrategy {
    @Override
    public void log(String msg) {
        System.out.println("FileLog" + msg);
    }
}
