package com.example.order.order_types;

import com.example.delivery.Delivery;
import com.example.item.Item;
import com.example.order.Address;
import com.example.order.Order;
import com.example.order.PriceStrategy;

public class HomeOrder extends Order {
    private Address address;
    private String fullName;
    private String phoneNumber;
    private String email;

    public HomeOrder(Item[] items, PriceStrategy[] priceStrategies, boolean homeOrder, boolean thirdParty,
            Address address, String fullName, String phoneNumber, String email, String service) {
        super(items, priceStrategies, homeOrder, thirdParty);
    }

    public Address getAddress() {
    }

}
