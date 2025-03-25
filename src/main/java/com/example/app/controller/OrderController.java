package com.example.app.controller;

import com.example.app.dto.OrderDtoRequest;
import com.example.app.model.Order;
import com.example.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository repository;

    @Autowired
    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return repository.getOrderById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    @PostMapping
    public boolean addOrder(@ModelAttribute OrderDtoRequest request) {
        return repository.addOrder(request);
    }
}
