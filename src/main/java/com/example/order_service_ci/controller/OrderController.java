package com.example.order_service_ci.controller;

import com.example.order_service_ci.entity.Order;
import com.example.order_service_ci.repository.OrderRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository repo;


    @PostMapping("/orders")
    public ResponseEntity<String> createOrder(@Valid @RequestBody Order request) {
        return ResponseEntity.ok("Order accepted");
    }

    @GetMapping
    public List<Order> getAll(){
        return repo.findAll();
    }
}
