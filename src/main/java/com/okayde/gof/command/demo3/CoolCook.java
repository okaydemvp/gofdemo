package com.okayde.gof.command.demo3;

public class CoolCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("CoolCook");
    }
}
