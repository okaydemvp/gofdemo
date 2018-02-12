package com.okayde.gof.command.demo3;

public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("HotCook");
    }
}
