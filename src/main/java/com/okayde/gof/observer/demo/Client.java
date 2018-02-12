package com.okayde.gof.observer.demo;

public class Client {
    public static void run() {
        NewSubject subject = new NewSubject();

        Reader reader1 = new Reader();
        reader1.setName("reader1");

        Reader reader2 = new Reader();
        reader2.setName("reader2");

        subject.attach(reader1);
        subject.attach(reader2);

        subject.setContent("NewSubject");
    }
}
