package com.okayde.gof.prototype.demo;

public class OrderBusiness {
    public void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > 1000) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(newOrder.getOrderProductNum() - 1000);
            //someOperation();
        }
    }
}
