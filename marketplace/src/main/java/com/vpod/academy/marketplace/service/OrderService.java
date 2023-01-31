package com.vpod.academy.marketplace.service;

import com.vpod.academy.marketplace.dto.OrderCreationDto;
import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.constant.OrderStatus;
import com.vpod.academy.marketplace.entity.OrderEntity;
import com.vpod.academy.marketplace.mapper.OrderMapper;
import com.vpod.academy.marketplace.repository.OrderRepository;
import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Service
public class OrderService {

  private final OrderRepository repository;
  private final OrderMapper mapper;

  public List<OrderDto> getAllOrders() {
    return mapper.mapToDtoAtList(repository.findAll());
  }

  public void setNewOrderStatus(Long id, String status) {
    OrderStatus orderStatus = OrderStatus.findByName(status);
    repository.setNewStatus(id, orderStatus);
  }

  public OrderDto createNewOrder(OrderCreationDto order) {
    OrderEntity orderToSave = mapper.mapToEntity(order);
    return mapper.mapToDto(repository.save(orderToSave));
  }
}
