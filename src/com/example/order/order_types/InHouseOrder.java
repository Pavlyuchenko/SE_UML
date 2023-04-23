/* 
 * GROUP 29
 * Michal Pavlíček, Luuk Dobbelaar
 * i6306065, i6331748
 */
package com.example.order.order_types;

import com.example.item.Item;
import com.example.order.Order;
import com.example.order.PriceStrategy;

public class InHouseOrder extends Order {
    private int tableNumber;

    public InHouseOrder(Item[] items, PriceStrategy[] priceStrategies, boolean homeOrder, boolean thirdParty,
            int tableNumber) {
        super(items, priceStrategies, homeOrder, thirdParty);
    }

    public int getTableNumber() {
    }

}
