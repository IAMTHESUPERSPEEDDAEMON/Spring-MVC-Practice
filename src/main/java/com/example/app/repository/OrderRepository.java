package com.example.app.repository;

import com.example.app.dto.OrderDtoRequest;
import com.example.app.model.Order;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OrderRepository{
    private final Map<Long, Order> orders = new HashMap<>();
    private Long nextId = 1L;

    public Order getOrderById(Long id) {
        return orders.get(id);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    public boolean addOrder(OrderDtoRequest request) {
        new Order(nextId++, request.date(), request.products());
        return true;
    }
}
