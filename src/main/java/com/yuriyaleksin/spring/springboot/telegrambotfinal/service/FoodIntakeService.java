package com.yuriyaleksin.spring.springboot.telegrambotfinal.service;


import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.FoodIntakeDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper.FoodIntakeMapper;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.repository.FoodIntakeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class FoodIntakeService {

    private final FoodIntakeRepository foodIntakeRepository;
    private final FoodIntakeMapper mapper;

    @Autowired
    public FoodIntakeService(FoodIntakeRepository foodIntakeRepository, FoodIntakeMapper mapper) {
        this.foodIntakeRepository = foodIntakeRepository;
        this.mapper = mapper;
    }

    public List<FoodIntakeDTO> getAllFoodIntakes() {
        log.info("getAllFoodIntakes in FoodIntakeService");
        return mapper.toListDTO(foodIntakeRepository.findAll());
    }

    public FoodIntakeDTO saveFoodIntake(FoodIntakeDTO foodIntakeDTO) {
        log.info("saveFoodIntake in FoodIntakeService");
        return mapper.toDTO(foodIntakeRepository.save(mapper.toEntity(foodIntakeDTO)));
    }

    public FoodIntakeDTO getFoodIntake(Long id) {
        log.info("getFoodIntake in FoodIntakeService");
        return mapper.toDTO(foodIntakeRepository.findById(id).orElse(null));
    }

    public void deleteFoodIntake(Long id) {
        log.info("deleteFoodIntake in FoodIntakeService");
        foodIntakeRepository.deleteById(id);
    }

    public List<FoodIntakeDTO> getFoodIntakesByUserId(Long userId) {
        log.info("getFoodIntakesByUserId in FoodIntakeService");
        return mapper.toListDTO(foodIntakeRepository.findALLByUserId(userId));
    }

    public List<FoodIntakeDTO> getFoodIntakesByUserIdAndDate(Long userId, LocalDate date) {
        log.info("getFoodIntakesByUserIdAndDate in FoodIntakeService");
        return mapper.toListDTO(foodIntakeRepository.findFoodIntakeByUserIdAndDate(userId, date));
    }

    public List<FoodIntakeDTO> getFoodIntakesByDateAndUserId(LocalDate startDate, LocalDate endDate, Long userId) {
        log.info("getFoodIntakesByDateAndUserId in FoodIntakeService");
        return mapper.toListDTO(foodIntakeRepository.findFoodIntakeByUserIdAndDateBetween(userId, startDate, endDate));
    }
}
