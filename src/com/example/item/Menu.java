package com.example.item;

import com.example.item.item_types.Dessert;
import com.example.item.item_types.Dish;
import com.example.item.item_types.Drink;

public class Menu {
    private Item[] items;

    public Menu() {
        Item dish = new Dish("Lasagne", "Main", 10.0);
        Item drink = new Drink("Coke", "Soft Drink", 2.0);
        Item dessert = new Dessert("Ice Cream", "Dessert", 3.0);

        addItem(dish);
        addItem(drink);
        addItem(dessert);
    }

    public void addItem(Item item) {
    }

    public void deleteItem(Item item) {
    }

    public Item[] getItems() {
    }
}
