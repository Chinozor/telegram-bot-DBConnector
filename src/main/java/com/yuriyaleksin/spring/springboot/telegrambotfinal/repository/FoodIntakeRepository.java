package com.yuriyaleksin.spring.springboot.telegrambotfinal.repository;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.FoodIntakeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FoodIntakeRepository extends JpaRepository<FoodIntakeEntity, Long> {
    List<FoodIntakeEntity> findALLByUserId(Long userId);

    List<FoodIntakeEntity> findFoodIntakeByUserIdAndDate(Long userId, LocalDate date);

    List<FoodIntakeEntity> findFoodIntakeByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
}
