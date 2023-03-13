package com.vpod.academy.marketplace.request;

import java.io.Serializable;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SmsCreateRequest implements Serializable {
  private String sender;
  private String messageText;
}
