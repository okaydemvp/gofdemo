package com.okayde.gof.strategy.demo4;

public class LogContext {
    public void log(String msg) {
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(msg);
        } catch (Exception err) {
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}
