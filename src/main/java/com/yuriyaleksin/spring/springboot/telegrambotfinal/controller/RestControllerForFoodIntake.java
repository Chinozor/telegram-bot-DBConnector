package com.yuriyaleksin.spring.springboot.telegrambotfinal.controller;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.FoodIntakeDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.service.FoodIntakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/food-intakes")
public class RestControllerForFoodIntake {

    private final FoodIntakeService foodIntakeService;

    @Autowired
    public RestControllerForFoodIntake(FoodIntakeService foodIntakeService) {
        this.foodIntakeService = foodIntakeService;
    }

    @GetMapping("/all")
    public List<FoodIntakeDTO> getAllFoodIntakes() {
        return foodIntakeService.getAllFoodIntakes();
    }

    @GetMapping("/user/{userId}")
    public List<FoodIntakeDTO> getFoodIntakesByUserId(@PathVariable Long userId) {
        return foodIntakeService.getFoodIntakesByUserId(userId);
    }

    @PostMapping
    public ResponseEntity<FoodIntakeDTO> saveFoodIntake(@RequestBody FoodIntakeDTO foodIntakeDTO) {
        FoodIntakeDTO response = foodIntakeService.saveFoodIntake(foodIntakeDTO);
        return ResponseEntity.created(URI.create("/food-intakes/" + response.getId())).body(response);
    }

    @GetMapping("/{id}")
    public FoodIntakeDTO getFoodIntakeById(@PathVariable Long id) {
        return foodIntakeService.getFoodIntake(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFoodIntakeById(@PathVariable Long id) {
        foodIntakeService.deleteFoodIntake(id);
    }

    @GetMapping("/user/{userId}/date/{date}")
    public List<FoodIntakeDTO> getFoodIntakesByUserIdAndDate(@PathVariable Long userId,
                                                             @PathVariable LocalDate date) {
        return foodIntakeService.getFoodIntakesByUserIdAndDate(userId, date);
    }

    @GetMapping("/user/{userId}/range/{startDate}/{endDate}")
    public List<FoodIntakeDTO> getFoodIntakesByDateAndUserId(@PathVariable Long userId,
                                                             @PathVariable LocalDate startDate,
                                                             @PathVariable LocalDate endDate) {
        return foodIntakeService.getFoodIntakesByDateAndUserId(startDate, endDate, userId);
    }
}
