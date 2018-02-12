package com.okayde.gof.builder.demo2;

public class Client {
    public static void run() {
        ConcreteBuilder builder = new ConcreteBuilder("001", 12345L, 67890L);
        InsuranceContract contract = builder.setPersonName("000").setOtherData("000").builder();
        contract.someOperation();
    }
}
