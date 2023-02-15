package com.vpod.academy.mobile.mapper;

import com.vpod.academy.mobile.dto.SmsDto;
import com.vpod.academy.mobile.entity.SmsEntity;
import com.vpod.academy.mobile.request.SmsCreateRequest;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MobileMapper {

  SmsDto mapToDto(SmsEntity entity);

  List<SmsDto> mapToDtoAtList(List<SmsEntity> entities);

  SmsEntity mapToEntity(SmsDto dto);

  List<SmsEntity> mapToEntityAtList(List<SmsDto> dtos);

  SmsEntity mapToEntity(SmsCreateRequest dto);
}
