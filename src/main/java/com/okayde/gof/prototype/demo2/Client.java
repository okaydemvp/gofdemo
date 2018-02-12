package com.okayde.gof.prototype.demo2;

public class Client {
    public static void run() {
        try {
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("Prototype1", p1);

            Prototype p3 = PrototypeManager.getPrototype("Prototype1").clone();
            p3.setName("3");
            System.out.println(p3);

            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("Prototype2", p2);

            Prototype p4 = PrototypeManager.getPrototype("Prototype2").clone();
            p4.setName("4");
            System.out.println(p4);

            PrototypeManager.removePrototype("Prototype1");
            Prototype p5 = PrototypeManager.getPrototype("Prototype1").clone();
            p5.setName("5");
            System.out.println(p5);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }
}
