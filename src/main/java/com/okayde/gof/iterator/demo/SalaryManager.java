package com.okayde.gof.iterator.demo;

public class SalaryManager extends Aggregate {
    private PayModel[] payModels = null;

    public PayModel[] getPays() {
        return payModels;
    }

    public void calcSalary() {
        PayModel payModel1 = new PayModel();
        payModel1.setPay(400);
        payModel1.setUserName("SalaryManager");

        payModels = new PayModel[1];
        payModels[1] = payModel1;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < payModels.length) {
            retObj = payModels[index];
        }
        return retObj;
    }

    public int size() {
        return payModels.length;
    }
}
