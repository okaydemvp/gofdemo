package com.okayde.gof.proxy.demo2;

public class Cilent {
    public static void run() {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookFacade = (BookFacadeImpl) cglib.getInstance(BookFacadeImpl.class);
        bookFacade.addBook();
    }
}
