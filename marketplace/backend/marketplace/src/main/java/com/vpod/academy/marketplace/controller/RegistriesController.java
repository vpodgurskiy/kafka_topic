package com.vpod.academy.marketplace.controller;

import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.dto.StatusRegistryDto;
import com.vpod.academy.marketplace.service.RegistriesService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registries")
@RequiredArgsConstructor
public class RegistriesController {

  private final RegistriesService registriesService;

  @GetMapping("/orders/status")
  public ResponseEntity<List<StatusRegistryDto>> getAllOrderStatuses() {
    return ResponseEntity.ok(registriesService.getAllOrderStatuses());
  }

}
