package com.vpod.academy.marketplace.constant;

import lombok.Getter;

@Getter
public enum OrderStatus {

  RESERVED("Ваш заказ успешно зарезервирован."),
  DELIVERED("Заказа доставлен получателю."),
  DELETED("Заказ отменен."),
  COURIER("Заказ передан курьеру, ожидайте");

  private final String description;

  OrderStatus(String description) {
    this.description = description;
  }

  public static OrderStatus findByName(String status) {
    return switch (status.toLowerCase()) {
      case "reserved" -> OrderStatus.RESERVED;
      case "delivered" -> OrderStatus.DELIVERED;
      case "deleted" -> OrderStatus.DELETED;
      case "courier" -> OrderStatus.COURIER;
      default -> throw new IllegalStateException("Unexpected value: " + status);
    };
  }
}
