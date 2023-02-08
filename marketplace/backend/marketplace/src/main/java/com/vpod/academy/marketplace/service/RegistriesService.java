package com.vpod.academy.marketplace.service;

import com.vpod.academy.marketplace.constant.OrderStatus;
import com.vpod.academy.marketplace.dto.StatusRegistryDto;
import com.vpod.academy.marketplace.mapper.StatusRegistryMapper;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistriesService {

  private final StatusRegistryMapper mapper;

  public List<StatusRegistryDto> getAllOrderStatuses() {
    return mapper.mapToDtoAtList(Arrays.stream(OrderStatus.values()).toList());
  }
}
