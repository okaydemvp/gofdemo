package com.okayde.gof.iterator.demo;

public class Client {
    public static void run() {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        test(salaryManager.createIterator());
    }

    private static void test(Iterator iterator) {
        iterator.first();
        while (!iterator.isDone()) {
            Object obj = iterator.currentItem();
            System.out.println(obj);
            iterator.next();
        }
    }
}
