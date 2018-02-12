package com.okayde.gof.iterator;

public class Client {
    public static void run() {
        String[] names = {"1", "2"};
        Aggregate aggregate = new ConcreteAggregate(names);
        Iterator iterator = aggregate.createIterator();
        iterator.first();
        while (!iterator.isDone()) {
            Object object = iterator.currentItem();
            System.out.println(object);
            iterator.next();
        }
    }
}
