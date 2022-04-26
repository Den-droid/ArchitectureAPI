package com.example.architectureapi.models;

import java.util.*;
import java.util.stream.Collectors;

public class DatabaseMock {
    public static String saveFoodToUsersCart(FoodAddToCartModel food, String userId) {
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

    public static String changeDeliveryStatus(String id, NewStatusIdModel newOrderStatusId) {
        return "Orders with id " + id + " now have status id " + newOrderStatusId.getNew_status_id();
    }

    public static List<Map<String, String>> getFoodByCategory(String type) {
        List<Map<String, String>> categories = new ArrayList<>();
        categories.add(new HashMap<>());
        categories.get(0).put("id", "568");
        categories.get(0).put("name", "Pizza Margarita");
        categories.get(0).put("photo_url", "/static/pizzas/margarita_500x500.png");
        categories.add(new HashMap<>());
        categories.get(1).put("id", "572");
        categories.get(1).put("name", "Pizza Pepperoni");
        categories.get(1).put("photo_url", "/static/pizzas/pepperoni_500x500.png");
        return categories;
    }

    public static Map<String, String> getOrderByID(String order_id) {
        Map<String, String> orderInfo = new LinkedHashMap<>();
        orderInfo.put("id", order_id);
        orderInfo.put("address", "boss str. 5");
        orderInfo.put("total_price", "80$");
        orderInfo.put("your_money", "15$");
        orderInfo.put("when_to_take", "5:15 pm");
        orderInfo.put("where_to_take", "restaurant Amerigo");
        return orderInfo;
    }

    public static List<Map<String, Object>> getUserOrders(String user_id) {
        List<Map<String, Object>> userOrders = new ArrayList<>();
        userOrders.add(0, new LinkedHashMap<>());
        userOrders.get(0).put("id", "234");
        userOrders.get(0).put("total_price", "68$");
        userOrders.get(0).put("status", "On the way");
        List<Map<String, String>> foodA = new ArrayList<>();
        foodA.add(new LinkedHashMap<>());
        foodA.get(0).put("name", "Chelentano");
        foodA.get(0).put("amount", "2");
        foodA.get(0).put("total_price", "40$");
        foodA.add(new HashMap<>());
        foodA.get(1).put("name", "Cheeseburger");
        foodA.get(1).put("amount", "2");
        foodA.get(1).put("total_price", "24$");
        userOrders.get(0).put("food", foodA);

        userOrders.add(1, new LinkedHashMap<>());
        userOrders.get(1).put("id", "451");
        userOrders.get(1).put("total_price", "75$");
        userOrders.get(1).put("status", "Status 4");
        List<Map<String, String>> foodB = new ArrayList<>();
        foodB.add(new LinkedHashMap<>());
        foodB.get(0).put("name", "Chelentano");
        foodB.get(0).put("amount", "2");
        foodB.get(0).put("total_price", "40$");
        foodB.add(new HashMap<>());
        foodB.get(1).put("name", "Cheeseburger");
        foodB.get(1).put("amount", "2");
        foodB.get(1).put("total_price", "24$");
        userOrders.get(1).put("food", foodB);
        return userOrders;
    }

    public static List<Map<String, String>> getOrdersByStreet(String name) {
        List<Map<String, String>> orders = new ArrayList<>();
        orders.add(new LinkedHashMap<>());
        orders.get(0).put("id", "34");
        orders.get(0).put("address", "Troyeschyna");
        orders.get(0).put("total_price", "68");
        orders.add(new LinkedHashMap<>());
        orders.get(1).put("id", "57");
        orders.get(1).put("address", "Poznyaky");
        orders.get(1).put("total_price", "80");
        orders.add(new LinkedHashMap<>());
        orders.get(2).put("id", "65");
        orders.get(2).put("address", "Livoberezhya");
        orders.get(2).put("total_price", "95");
        return orders;
    }

    public static Map<String, String> getUserInfo(String user_id) {
        Map<String, String> userInfo = new LinkedHashMap<>();
        userInfo.put("id", user_id);
        userInfo.put("name", "Anton");
        userInfo.put("surname", "Korovay");
        userInfo.put("phone", "0951340744");
        userInfo.put("email", "anton.korovay@gmail.com");
        userInfo.put("role", "Client");
        return userInfo;
    }
    public static Map<String, Object> getOrderStatus(String order_id) {
        Map<String, Object> status = new LinkedHashMap<>();

        List<Map<String, String>> statuses = new ArrayList<>();
        statuses.add(new LinkedHashMap<>());
        statuses.get(0).put("id", "1");
        statuses.get(0).put("name", "The order is taken");
        statuses.add(new LinkedHashMap<>());
        statuses.get(1).put("id", "2");
        statuses.get(1).put("name", "On the way");
        statuses.add(new LinkedHashMap<>());
        statuses.get(2).put("id", "3");
        statuses.get(2).put("name", "The order is close");
        statuses.add(new LinkedHashMap<>());
        statuses.get(3).put("id", "4");
        statuses.get(3).put("name", "The order is ready");

        status.put("statuses", statuses);
        status.put("active_status_id", "1");
        return status;
    }

    public static List<Map<String, String>> getAddressesByDef(String user_id) {
        List<Map<String, String>> regions = new ArrayList<>();
        regions.add(new HashMap<>());
        regions.get(0).put("address", "Troyeschyna, 13");
        regions.add(new HashMap<>());
        regions.get(1).put("address", "Poznyaky, 11");
        regions.add(new HashMap<>());
        regions.get(2).put("address", "Livoberezhya, 17");
        return regions;
    }

    public static List<Map<String, String>> getPrefRegions(String user_id) {
        List<Map<String, String>> regions = new ArrayList<>();
        regions.add(new HashMap<>());
        regions.get(0).put("address", "Troyeschyna");
        regions.add(new HashMap<>());
        regions.get(1).put("address", "Poznyaky");
        regions.add(new HashMap<>());
        regions.get(2).put("address", "Livoberezhya");
        return regions;
    }

    public static String addPrefRegions(String userId, AddPrefRegionsModel model) {
        return "There were added " + model.getAddresses().stream()
                .map(x -> x.getAddress())
                .collect(Collectors.joining(", "))
                +  " to user with id " + userId;
    }

    public static String takeOrder(String orderId, CourierTakesOrderModel model) {
        return "User with id " + model.getUser_id() + " takes order with id " + orderId;
    }
}
