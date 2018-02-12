package com.okayde.gof.command.demo;

public class GigaMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("Begin");
        System.out.println("Run open");
        System.out.println("End");
    }

    @Override
    public void reset() {
        System.out.println("Begin");
        System.out.println("Run reset");
        System.out.println("End");
    }
}
