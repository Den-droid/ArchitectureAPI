package com.example.architectureapi.controllers;

import com.example.architectureapi.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @PostMapping(path = "/users/{userId}/cart/add")
    public Map<String, String> AddToCart(@PathVariable String userId, @RequestBody FoodAddToCartModel food) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.saveFoodToUsersCart(food, userId));
        return toReturn;
    }

    @GetMapping(path = "/categories")
    public List<Map<String, String>> GetCategories() {
        return DatabaseMock.getCategories();
    }

    @GetMapping(path = "/food/{id}")
    public Map<String, Object> GetFoodById(@PathVariable String id) {
        return DatabaseMock.getFood(id);
    }

    @GetMapping(path = "/users/{id}/cart")
    public Map<String, Object> GetUsersCartByUserId(@PathVariable String id) {
        return DatabaseMock.getCart(id);
    }

    @PutMapping(path = "/orders/{id}/status/change")
    public Map<String, String> ChangeOrderDeliveryStatus(@RequestBody NewStatusIdModel newOrderStatusId, @PathVariable String id) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.changeDeliveryStatus(id, newOrderStatusId));
        return toReturn;
    }

    @GetMapping(path = "/food/categories/{type}")
    public List<Map<String, String>> GetFoodByCategory(@PathVariable String type) {
        return DatabaseMock.getFoodByCategory(type);
    }

    @GetMapping(path = "/orders/{orderId}")
    public Map<String, String> GetOrderByID(@PathVariable String orderId) {
        return DatabaseMock.getOrderByID(orderId);
    }

    @PostMapping(path = "/orders/{orderId}/take")
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
    public List<Map<String, String>> GetOrdersByStreet(@RequestParam String street) {
        return DatabaseMock.getOrdersByStreet(street);
    }

    @GetMapping(path = "/users/{userId}")
    public Map<String, String> GetUserInfoById(@PathVariable String userId) {
        return DatabaseMock.getUserInfo(userId);
    }

    @GetMapping(path = "/orders/{orderId}/status")
    public Map<String, Object> GetOrderStatusById(@PathVariable String orderId) {
        return DatabaseMock.getOrderStatus(orderId);
    }

    @GetMapping(path = "/users/{userId}/addresses_by_def")
    public List<Map<String, String>> GetAddressesByDefByUserId(@PathVariable String userId) {
        return DatabaseMock.getAddressesByDef(userId);
    }

    @GetMapping(path = "/users/{userId}/pref_regions")
    public List<Map<String, String>> GetPrefRegionsByUserId(@PathVariable String userId) {
        return DatabaseMock.getPrefRegions(userId);
    }

    @PostMapping(path = "/users/{userId}/pref_regions/add")
    public Map<String, String> AddPrefRegionsToUser(@PathVariable String userId, @RequestBody AddPrefRegionsModel prefRegions) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.addPrefRegions(userId, prefRegions));
        return toReturn;
    }
}

