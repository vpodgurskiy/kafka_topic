package com.vpod.academy.marketplace.mapper;

import com.vpod.academy.marketplace.dto.OrderCreationDto;
import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.entity.OrderEntity;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {

  @Mapping(target="orderStatus", source="status")
  OrderDto mapToDto(OrderEntity entity);

  List<OrderDto> mapToDtoAtList(List<OrderEntity> entity);

  @Mapping(target="status", source="orderStatus")
  OrderEntity mapToEntity(OrderDto dto);

  List<OrderEntity> mapToEntityAtList(List<OrderDto> dto);

  @Mapping(target="status", source="orderStatus")
  OrderEntity mapToEntity(OrderCreationDto dto);
}
