package com.okayde.gof.iterator.demo;

import java.util.ArrayList;
import java.util.List;

public class PayManager extends Aggregate {
    private List list = new ArrayList();

    public List getPayList() {
        return list;
    }

    public void calcPay() {
        PayModel payModel1 = new PayModel();
        payModel1.setPay(300);
        payModel1.setUserName("PayModel1");

        list.add(payModel1);
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < list.size()) {
            retObj = list.get(index);
        }
        return retObj;
    }

    public int size() {
        return list.size();
    }
}
