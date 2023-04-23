package com.example.order.price_strategy_types;

import java.util.Date;

import com.example.item.Item;
import com.example.order.PriceStrategy;

public class PercentageStrategy implements PriceStrategy {
    private String name;
    private int percentage;
    private boolean discount;

    public PercentageStrategy(String name, int percentage, boolean discount) {
    }

    public int getPercentage() {
    }

    public boolean isDiscount() {
    }
}
