package com.vpod.academy.marketplace.controller;

import com.vpod.academy.marketplace.dto.OrderCreationDto;
import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.entity.OrderEntity;
import com.vpod.academy.marketplace.request.OrderStatusRequest;
import com.vpod.academy.marketplace.service.MobileService;
import com.vpod.academy.marketplace.service.OrderService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MarketController {

  private final OrderService orderService;
  private final MobileService mobileService;

  @GetMapping("/orders")
  public ResponseEntity<List<OrderDto>> getAllOrders() {
    return ResponseEntity.ok(orderService.getAllOrders());
  }

  @PatchMapping("/orders/{orderId}/setStatus")
  public ResponseEntity<Void> setNewOrderStatus(@PathVariable Long orderId,
      @RequestBody(required = false) final String status) {
    orderService.setNewOrderStatus(orderId, status);
    mobileService.sendMessage(orderService.getOrder(orderId));
    return ResponseEntity.noContent().build();
  }

  @PostMapping("/orders/create")
  public ResponseEntity<OrderDto> createNewOrder(@RequestBody OrderCreationDto order) {
    return ResponseEntity.ok(orderService.createNewOrder(order));
  }
}
