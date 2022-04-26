package com.example.architectureapi.models;

import java.util.List;

public class FoodAddToCartModel {
    private String id;
    private int amount;
    private List<AdditionAddToCartModel> additions;

    public FoodAddToCartModel(String id, int amount, List<AdditionAddToCartModel> additions) {
        this.id = id;
        this.amount = amount;
        this.additions = additions;
    }

    public List<AdditionAddToCartModel> getAdditions() {
        return additions;
    }

    public void setAdditions(List<AdditionAddToCartModel> additions) {
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
