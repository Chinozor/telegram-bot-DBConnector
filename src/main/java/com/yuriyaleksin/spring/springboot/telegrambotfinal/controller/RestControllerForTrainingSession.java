package com.yuriyaleksin.spring.springboot.telegrambotfinal.controller;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.TrainingSessionDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.service.TrainingSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/trainingSession")
public class RestControllerForTrainingSession {

    private TrainingSessionService trainingSessionService;

    @Autowired
    public void setTrainingSessionService(TrainingSessionService trainingSessionService) {
        this.trainingSessionService = trainingSessionService;
    }

    @GetMapping("/test1")
    public List<TrainingSessionDTO> getAllTrainingSessions() {
        return trainingSessionService.getAllTrainingSessions();
    }

    @PostMapping("/test2")
    public ResponseEntity<TrainingSessionDTO> saveTrainingSession(TrainingSessionDTO trainingSessionDTO) {
        var response = trainingSessionService.saveTrainingSession(trainingSessionDTO);
        return ResponseEntity.created(URI.create("/food-intake/")).body(response);
    }

    @GetMapping("/test3/{id}")
    public TrainingSessionDTO getGymById(@PathVariable Long id) {
        return trainingSessionService.getTrainingSessionById(id);
    }

    @DeleteMapping("/test4/{id}")
    public void deleteGymById(@PathVariable Long id) {
        trainingSessionService.deleteTrainingSession(id);
    }
}
