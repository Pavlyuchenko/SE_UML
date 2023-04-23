package com.example.order.price_strategy_types;

import java.util.Date;

import com.example.item.Item;
import com.example.order.PriceStrategy;

public class FreeExtraStrategy implements PriceStrategy {
    private String name;
    private Item[] forItems;
    private Item bonusItem;

    public FreeExtraStrategy(String name, Item[] forItems, Item bonusItem) {
    }

    public Item[] getItems() {
    }

    public Item getBonusItem() {
    }
}
