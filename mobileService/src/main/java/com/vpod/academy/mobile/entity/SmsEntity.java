package com.vpod.academy.mobile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "messages")
@NoArgsConstructor
public class SmsEntity {

  @Id
  @SequenceGenerator(name = "messages_id_seq", sequenceName = "messages_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messages_id_seq")
  private Long id;

  private String sender;

  @Column(name = "message_text")
  private String messageText;
}
