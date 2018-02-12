package com.okayde.gof.strategy.demo4;

public class DbLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        System.out.println("DbLog" + msg);
    }
}
