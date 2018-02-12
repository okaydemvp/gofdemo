package com.okayde.gof.strategy.demo4;

public class FileLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        System.out.println("FileLog" + msg);
    }
}
