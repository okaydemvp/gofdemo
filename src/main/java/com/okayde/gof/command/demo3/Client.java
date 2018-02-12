package com.okayde.gof.command.demo3;

public class Client {
    public static void run() {
        Waiter waiter = new Waiter();
        Command chop = new ChopCommand();

        waiter.orderDish(chop);
        waiter.orderOver();
    }
}
