package com.vpod.academy.mobile.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SmsDto implements Serializable {
  private String id;
  private String sender;
  private String messageText;
}
