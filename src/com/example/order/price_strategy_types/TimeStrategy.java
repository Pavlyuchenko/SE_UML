/* 
 * GROUP 29
 * Michal Pavlíček, Luuk Dobbelaar
 * i6306065, i6331748
 */
package com.example.order.price_strategy_types;

import java.util.Date;

import com.example.order.PriceStrategy;

public class TimeStrategy implements PriceStrategy {
    private String name;
    private Date timeBetween;
    private int percentage;

    public TimeStrategy(String name, Date timeBetween, int percentage) {
    }

    public Date getTimeBetween() {
    }

    public int getPercentage() {
    }
}
