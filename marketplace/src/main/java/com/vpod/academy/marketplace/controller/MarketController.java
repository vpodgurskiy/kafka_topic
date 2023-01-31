package com.vpod.academy.marketplace.controller;

import com.vpod.academy.marketplace.dto.OrderCreationDto;
import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MarketController {

  private final OrderService orderService;

  @GetMapping("/orders")
  public String getAllOrders(Model model) {
    model.addAttribute("orders", orderService.getAllOrders());
    return "allOrders.html";
  }

  @PostMapping("/orders/{id}/setStatus")
  public ResponseEntity<Void> setNewOrderStatus(@PathVariable Long id, @RequestBody String status) {
    orderService.setNewOrderStatus(id, status);
    return ResponseEntity.noContent().build();
  }

  @PostMapping("/orders/create")
  public ResponseEntity<OrderDto> createNewOrder(@RequestBody OrderCreationDto order) {
    return ResponseEntity.ok(orderService.createNewOrder(order));
  }
}
