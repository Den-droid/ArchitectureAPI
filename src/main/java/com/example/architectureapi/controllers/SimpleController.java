package com.example.architectureapi.controllers;

import com.example.architectureapi.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @PostMapping(path = "/users/{user_id}/cart/add")
    public Map<String, String> AddToCart(@PathVariable String user_id, @RequestBody FoodAddToCartModel food) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.saveFoodToUsersCart(food, user_id));
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

    @GetMapping(path = "/orders/{order_id}")
    public Map<String, String> GetOrderByID(@PathVariable String order_id) {
        return DatabaseMock.getOrderByID(order_id);
    }

    @PostMapping(path = "/orders/{order_id}/take")
    public Map<String, String> TakeOrder(@PathVariable String order_id, @RequestBody CourierTakesOrderModel cto) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.takeOrder(order_id, cto));
        return toReturn;
    }

    @GetMapping(path = "/users/{user_id}/orders")
    public List<Map<String, Object>> GetUserOrdersById(@PathVariable String user_id) {
        return DatabaseMock.getUserOrders(user_id);
    }

    @GetMapping(path = "/orders")
    public List<Map<String, String>> GetOrdersByStreet(@RequestParam String street) {
        return DatabaseMock.getOrdersByStreet(street);
    }

    @GetMapping(path = "/users/{user_id}")
    public Map<String, String> GetUserInfoById(@PathVariable String user_id) {
        return DatabaseMock.getUserInfo(user_id);
    }

    @GetMapping(path = "/orders/{order_id}/status")
    public Map<String, Object> GetOrderStatusById(@PathVariable String order_id) {
        return DatabaseMock.getOrderStatus(order_id);
    }

    @GetMapping(path = "/users/{user_id}/addresses_by_def")
    public List<Map<String, String>> GetAddressesByDefByUserId(@PathVariable String user_id) {
        return DatabaseMock.getAddressesByDef(user_id);
    }

    @GetMapping(path = "/users/{user_id}/pref_regions")
    public List<Map<String, String>> GetPrefRegionsByUserId(@PathVariable String user_id) {
        return DatabaseMock.getPrefRegions(user_id);
    }

    @PostMapping(path = "/users/{user_id}/pref_regions/add")
    public Map<String, String> AddPrefRegionsToUser(@PathVariable String user_id, @RequestBody AddPrefRegionsModel prefRegions) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.addPrefRegions(user_id, prefRegions));
        return toReturn;
    }
}

