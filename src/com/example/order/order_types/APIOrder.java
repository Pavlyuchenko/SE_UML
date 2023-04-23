/* 
 * GROUP 29
 * Michal Pavlíček, Luuk Dobbelaar
 * i6306065, i6331748
 */
package com.example.order.order_types;

import com.example.item.Item;
import com.example.order.Address;
import com.example.order.Order;
import com.example.order.PriceStrategy;

public class APIOrder extends Order {
    private Address address;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String service;

    public APIOrder(Item[] items, PriceStrategy[] priceStrategies, boolean homeOrder, boolean thirdParty,
            Address address, String fullName, String phoneNumber, String email, String service) {
        super(items, priceStrategies, homeOrder, thirdParty);
    }

    public Address getAddress() {
    }

}
