package com.yuriyaleksin.spring.springboot.telegrambotfinal.service;


import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.FoodIntakeDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper.FoodIntakeMapper;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.repository.FoodIntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

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
        System.out.println(foodIntakeRepository.findAll());
        return mapper.toListDTO(foodIntakeRepository.findAll());
    }

    public FoodIntakeDTO saveFoodIntake(FoodIntakeDTO foodIntakeDTO) {
        return mapper.toDTO(foodIntakeRepository.save(mapper.toEntity(foodIntakeDTO)));
    }

    public FoodIntakeDTO getFoodIntake(Long id) {
        return mapper.toDTO(foodIntakeRepository.findById(id).orElse(null));
    }

    public void deleteFoodIntake(Long id) {
        foodIntakeRepository.deleteById(id);
    }

    public List<FoodIntakeDTO> getFoodIntakesByUserId(Long userId) {
        return mapper.toListDTO(foodIntakeRepository.findALLByUserId(userId));
    }

    public List<FoodIntakeDTO> getFoodIntakesByUserIdAndDate(Long userId, LocalDate date) {
        return mapper.toListDTO(foodIntakeRepository.findFoodIntakeByUserIdAndDate(userId, date));
    }

    public List<FoodIntakeDTO> getFoodIntakesByDateAndUserId(LocalDate startDate, LocalDate endDate, Long userId) {
        return mapper.toListDTO(foodIntakeRepository.findFoodIntakeByUserIdAndDateBetween(userId, startDate, endDate));
    }
}
