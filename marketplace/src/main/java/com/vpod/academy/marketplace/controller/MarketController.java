package com.vpod.academy.marketplace.controller;

import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MarketController {

  private final OrderService orderService;

  @GetMapping("/orders")
  ResponseEntity<List<OrderDto>> getAllOrders() {
    return ResponseEntity.ok(orderService.getAllOrders());
  }

  @PostMapping("/orders/{id}/setStatus")
  ResponseEntity<Void> setNewOrderStatus(@PathVariable Long id, @RequestBody String status) {
    orderService.setNewOrderStatus(id, status);
    return ResponseEntity.noContent().build();
  }
}
