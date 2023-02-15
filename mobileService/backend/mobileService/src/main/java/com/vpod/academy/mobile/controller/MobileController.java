package com.vpod.academy.mobile.controller;

import com.vpod.academy.mobile.dto.SmsDto;
import com.vpod.academy.mobile.request.SmsCreateRequest;
import com.vpod.academy.mobile.service.MobileService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MobileController {

  private final MobileService mobileService;

  @GetMapping("/text_messages")
  public ResponseEntity<List<SmsDto>> getAllSms() {
    return ResponseEntity.ok(mobileService.getAllSms());
  }

  @DeleteMapping("/text_messages")
  public ResponseEntity<Void> deleteAllSms() {
    mobileService.deleteAllSms();
    return ResponseEntity.noContent().build();
  }

  @PutMapping("/text_messages")
  public ResponseEntity<SmsDto> createSms(@RequestBody SmsCreateRequest request) {
    return ResponseEntity.ok(mobileService.createSms(request));
  }
}
