package com.example.architectureapi.controllers;

import com.example.architectureapi.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SimpleController {

    @PutMapping(path = "/users/{userId}/cart")
    public Map<String, String> AddToCart(@PathVariable String userId, @RequestBody FoodAddToCartModel food) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.saveFoodToUsersCart(food, userId));
        return toReturn;
    }

    @GetMapping(path = "/categories")
    public List<Map<String, String>> GetCategories() {
        return DatabaseMock.getCategories();
    }

    @GetMapping(path = "/food/{foodId}")
    public Map<String, Object> GetFoodById(@PathVariable String foodId) {
        return DatabaseMock.getFood(foodId);
    }

    @GetMapping(path = "/users/{userId}/cart")
    public Map<String, Object> GetUsersCartByUserId(@PathVariable String userId) {
        return DatabaseMock.getCart(userId);
    }

    @PutMapping(path = "/orders/{orderId}/status")
    public Map<String, String> ChangeOrderDeliveryStatus(@RequestBody NewStatusIdModel newOrderStatusId, @PathVariable String orderId) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.changeDeliveryStatus(orderId, newOrderStatusId));
        return toReturn;
    }

    @GetMapping(path = "/food/categories/{category}")
    public List<Map<String, String>> GetFoodByCategory(@PathVariable String category) {
        return DatabaseMock.getFoodByCategory(category);
    }

    @GetMapping(path = "/orders/{orderId}")
    public Map<String, String> GetOrderByID(@PathVariable String orderId) {
        return DatabaseMock.getOrderByID(orderId);
    }

    @PostMapping(path = "/orders/{orderId}:take")
    public Map<String, String> TakeOrder(@PathVariable String orderId, @RequestBody CourierTakesOrderModel cto) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.takeOrder(orderId, cto));
        return toReturn;
    }

    @GetMapping(path = "/users/{userId}/orders")
    public List<Map<String, Object>> GetUserOrdersById(@PathVariable String userId) {
        return DatabaseMock.getUserOrders(userId);
    }

    @GetMapping(path = "/orders")
    public Map<String, Object> GetOrders(@RequestParam(name = "street", required = false) String street,
                                                       @RequestParam(name = "page", required = false, defaultValue = "1") int page) {
        return DatabaseMock.getOrders(street, page);
    }

    @GetMapping(path = "/users/{userId}")
    public Map<String, String> GetUserInfoById(@PathVariable String userId) {
        return DatabaseMock.getUserInfo(userId);
    }

    @GetMapping(path = "/orders/{orderId}/status")
    public Map<String, Object> GetOrderStatusById(@PathVariable String orderId) {
        return DatabaseMock.getOrderStatus(orderId);
    }

    @GetMapping(path = "/users/{userId}/addressesByDef")
    public List<Map<String, String>> GetAddressesByDefByUserId(@PathVariable String userId) {
        return DatabaseMock.getAddressesByDef(userId);
    }

    @GetMapping(path = "/users/{userId}/prefRegions")
    public List<Map<String, String>> GetPrefRegionsByUserId(@PathVariable String userId) {
        return DatabaseMock.getPrefRegions(userId);
    }

    @PostMapping(path = "/users/{userId}/prefRegions")
    public Map<String, String> AddPrefRegionsToUser(@PathVariable String userId, @RequestBody AddPrefRegionsModel prefRegions) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.addPrefRegions(userId, prefRegions));
        return toReturn;
    }
}

