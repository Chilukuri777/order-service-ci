package com.example.order_service_ci.repository;

import com.example.order_service_ci.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
