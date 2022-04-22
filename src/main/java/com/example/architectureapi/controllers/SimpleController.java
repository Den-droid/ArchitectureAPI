package com.example.architectureapi.controllers;

import com.example.architectureapi.models.DatabaseMock;
import com.example.architectureapi.models.FoodAddToCart;
import com.example.architectureapi.models.NewStatusId;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @PostMapping(path = "/users/{user_id}/cart/add")
    public Map<String, String> AddToCart(@PathVariable String user_id, @RequestBody FoodAddToCart food) {
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.saveFoodToUsersCart(food, user_id));
        return toReturn;
    }

    @GetMapping(path = "/categories")
    public List<Map<String, String>> GetCategories() {
        return DatabaseMock.getCategories();
    }

    @GetMapping(path = "/food/{id}")
    public Map<String, Object> GetFood(@PathVariable String id) {
        return DatabaseMock.getFood(id);
    }

    @GetMapping(path = "/users/{id}/cart")
    public Map<String, Object> GetUsersCart(@PathVariable String id) {
        return DatabaseMock.getCart(id);
    }

    @PutMapping(path = "/orders/{id}/status/change")
    public Map<String, String> ChangeOrderDeliveryStatus(@RequestBody NewStatusId newOrderStatusId, @PathVariable String id){
        Map<String, String> toReturn = new HashMap<>();
        toReturn.put("message", DatabaseMock.changeDeliveryStatus(id, newOrderStatusId));
        return toReturn;
    }
}
