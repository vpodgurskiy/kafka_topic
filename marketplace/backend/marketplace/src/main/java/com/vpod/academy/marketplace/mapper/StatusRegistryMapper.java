package com.vpod.academy.marketplace.mapper;

import com.vpod.academy.marketplace.constant.OrderStatus;
import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.dto.StatusRegistryDto;
import com.vpod.academy.marketplace.entity.OrderEntity;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StatusRegistryMapper {

  @Mapping(source = "status", target = "statusName", qualifiedByName = "mapStatuses")
  StatusRegistryDto mapToDto(OrderStatus status);

  List<StatusRegistryDto> mapToDtoAtList(List<OrderStatus> entity);

  @Named("mapStatuses")
  default String mapStatuses(OrderStatus status) {
    return status.name();
  }
}
