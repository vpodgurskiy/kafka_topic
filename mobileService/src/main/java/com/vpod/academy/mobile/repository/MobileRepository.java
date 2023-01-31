package com.vpod.academy.mobile.repository;

import com.vpod.academy.mobile.entity.SmsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<SmsEntity, Long> {
}
