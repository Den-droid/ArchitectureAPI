package com.example.architectureapi.models;

import java.util.*;

public class DatabaseMock {
    public static String saveFoodToUsersCart(FoodAddToCart food, String userId) {
        return "Food with id " + food.getId() + " was successfully to user's cart with id " + userId;
    }

    public static List<Map<String, String>> getCategories() {
        List<Map<String, String>> categories = new ArrayList<>();
        categories.add(new HashMap<>());
        categories.get(0).put("name", "burgers");
        categories.get(0).put("url", "/burgers");
        categories.add(new HashMap<>());
        categories.get(1).put("name", "pizzas");
        categories.get(1).put("url", "/pizzas");
        categories.add(new HashMap<>());
        categories.get(2).put("name", "sushi");
        categories.get(2).put("url", "/sushi");
        return categories;
    }

    public static Map<String, Object> getFood(String id) {
        Map<String, Object> food = new LinkedHashMap<>();
        food.put("id", id);
        food.put("name", "Pizza Margarite");
        food.put("photo_url", "/static/pizzas/margarita_500x500.png");
        food.put("ingredients", "tomato sauce, tomatoes, Mozarella cheese");
        List<Map<String, String>> additions = new ArrayList<>();
        additions.add(new LinkedHashMap<>());
        additions.get(0).put("id", "1");
        additions.get(0).put("name", "ketchup");
        additions.get(0).put("amount", "50ml");
        additions.add(new HashMap<>());
        additions.get(1).put("id", "2");
        additions.get(1).put("name", "mustard");
        additions.get(1).put("amount", "50ml");
        additions.add(new HashMap<>());
        additions.get(2).put("id", "3");
        additions.get(2).put("name", "garlic sauce");
        additions.get(2).put("amount", "50ml");
        food.put("additions", additions);
        return food;
    }

    public static Map<String, Object> getCart(String user_id) {
        Map<String, Object> cart = new LinkedHashMap<>();
        cart.put("delivery_price", "20$");
        cart.put("total_price", "97$");
        List<Map<String, Object>> food = new ArrayList<>();
        food.add(new LinkedHashMap<>());
        food.get(0).put("name", "pizza margarita");
        food.get(0).put("amount", "2");
        food.get(0).put("total_price", "40$");
        food.get(0).put("additions", new ArrayList<Map<String, String>>());
        food.add(new LinkedHashMap<>());
        food.get(1).put("name", "hamburger");
        food.get(1).put("amount", "3");
        food.get(1).put("total_price", "36$");
        food.get(1).put("additions", new ArrayList<Map<String, String>>());
        cart.put("food", food);
        return cart;
    }

    public static String changeDeliveryStatus(String id, NewStatusId newOrderStatusId) {
        return "Orders with id " + id + " now have status id " + newOrderStatusId.getNew_status_id();
    }
}
