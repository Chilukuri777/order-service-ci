package com.example.order_service_ci.controller;

import com.example.order_service_ci.entity.Order;
import com.example.order_service_ci.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository repo;

    @PostMapping
    public Order create(@RequestBody Order order){
        return repo.save(order);
    }

    @GetMapping
    public List<Order> getAll(){
        return repo.findAll();
    }
}
