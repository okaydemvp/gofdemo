package com.okayde.gof.prototype.demo;

public interface OrderApi {
    int getOrderProductNum();

    void setOrderProductNum(int num);

    OrderApi cloneOrder();
}
