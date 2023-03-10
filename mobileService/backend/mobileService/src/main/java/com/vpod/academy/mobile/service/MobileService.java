package com.vpod.academy.mobile.service;

import com.vpod.academy.mobile.dto.SmsDto;
import com.vpod.academy.mobile.repository.MobileRepository;
import com.vpod.academy.mobile.mapper.MobileMapper;
import com.vpod.academy.mobile.request.SmsCreateRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileService {

  private final MobileRepository repository;
  private final MobileMapper mapper;

  public List<SmsDto> getAllSms() {
    return mapper.mapToDtoAtList(repository.findAll());
  }

  public SmsDto createSms(SmsCreateRequest smsToSave) {
    return mapper.mapToDto(
        repository.save(
            mapper.mapToEntity(smsToSave)
        )
    );
  }

  public void deleteAllSms() {
    repository.deleteAll();
  }
}
