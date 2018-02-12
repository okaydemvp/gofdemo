package com.okayde.gof.strategy.demo4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LogStrategyTemplate implements LogStrategy {
    @Override
    public final void log(String msg) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        msg = dateFormat.format(new Date()) + msg;
        doLog(msg);
    }

    protected abstract void doLog(String msg);
}
