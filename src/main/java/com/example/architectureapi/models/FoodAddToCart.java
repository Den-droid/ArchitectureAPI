package com.example.architectureapi.models;

import java.util.List;

public class FoodAddToCart {
    private String id;
    private int amount;
    private List<AdditionAddToCart> additions;

    public FoodAddToCart(String id, int amount, List<AdditionAddToCart> additions) {
        this.id = id;
        this.amount = amount;
        this.additions = additions;
    }

    public List<AdditionAddToCart> getAdditions() {
        return additions;
    }

    public void setAdditions(List<AdditionAddToCart> additions) {
        this.additions = additions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
