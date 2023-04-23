package com.example.delivery;

import com.example.order.Order;

public class Delivery {
    private int id;
    private Order order;
    private DeliveryStatus status;

    public Delivery(Order order) {
        status = new DeliveryStatus();
    }

    public void updateStatus(DeliveryStatus status) {
    }

    public DeliveryStatus getStatus() {
    }
}
