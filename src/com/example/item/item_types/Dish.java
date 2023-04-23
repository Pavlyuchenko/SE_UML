package com.example.item.item_types;

import com.example.item.Ingredient;
import com.example.item.Item;
import com.example.item.Price;

public class Dish implements Item {
    private String name;
    private Ingredient[] ingredients;
    private Price price;
    private String type;

    public Dish(String name, String type, double price) {
    }

    @Override
    public String getName() {
    }

    public Ingredient[] getIngredients() {
    }

    public void addIngredient(Ingredient ingredient) {
    }

    public Double calculatePrice() {
    }

    @Override
    public String getType() {
    }

}
