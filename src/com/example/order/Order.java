/* 
 * GROUP 29
 * Michal Pavlíček, Luuk Dobbelaar
 * i6306065, i6331748
 */
package com.example.order;

import com.example.item.Item;

// For the Examples, not needed for the UML
import com.example.order.order_types.APIOrder;
import com.example.order.order_types.HomeOrder;
import com.example.order.order_types.InHouseOrder;
import com.example.delivery.Delivery;

public abstract class Order {
    private int id;
    private Item[] items;
    private PriceStrategy[] priceStrategies;
    private boolean homeOrder;
    private boolean thirdParty;
    private boolean prepared;

    public Order(Item[] items, PriceStrategy[] priceStrategies, boolean homeOrder, boolean thirdParty) {
        Order inHouse = new InHouseOrder(items, priceStrategies, homeOrder, thirdParty, 1);
        Order home = new HomeOrder(items, priceStrategies, homeOrder, thirdParty, new Address(null, id, null, null),
                "John Doe",
                "1234567890",
                "test@test.test", "Uber Eats");

        Order api = new APIOrder(items, priceStrategies, homeOrder, thirdParty, new Address(null, id, null, null),
                "John Doe",
                "1234567890",
                "",
                "Uber Eats");

        Delivery delivery = new Delivery(api);
        Delivery delivery2 = new Delivery(home);
        Delivery delivery3 = new Delivery(inHouse);
    }

    public int getID() {
    }

    public double getTotal() {
    }

    public void setPrepared() {
    }
}
