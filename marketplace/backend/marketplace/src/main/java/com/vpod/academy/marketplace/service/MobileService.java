package com.vpod.academy.marketplace.service;

import com.vpod.academy.marketplace.dto.OrderDto;
import com.vpod.academy.marketplace.dto.SmsDto;
import com.vpod.academy.marketplace.request.SmsCreateRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@RequiredArgsConstructor
@Service
public class MobileService {

  private final RestTemplate restTemplate;

  public SmsDto sendMessage(OrderDto order) {
    SmsCreateRequest request = new SmsCreateRequest();
    request.setMessageText(
        String.format(
            "Status for order number %s was changed to %s", order.getOrderNumber(),
            order.getOrderStatus()
        )
    );
    request.setSender("Your MARKETPLACE");
    HttpEntity<SmsCreateRequest> entity = new HttpEntity<>(request);
    ResponseEntity<SmsDto> responseEntity = restTemplate.exchange(
        "http://localhost:9092/mobile/text_messages",
        HttpMethod.PUT,
        entity,
        SmsDto.class);
    return responseEntity.getBody();
  }
}
