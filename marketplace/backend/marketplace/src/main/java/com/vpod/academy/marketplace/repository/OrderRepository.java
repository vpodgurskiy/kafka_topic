package com.vpod.academy.marketplace.repository;

import com.vpod.academy.marketplace.entity.OrderEntity;
import com.vpod.academy.marketplace.constant.OrderStatus;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

  @Transactional
  @Modifying
  @Query("update OrderEntity or set or.status = :orderStatus where or.id = :id")
  void setNewStatus(Long id, OrderStatus orderStatus);
}
