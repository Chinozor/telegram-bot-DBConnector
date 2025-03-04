package com.yuriyaleksin.spring.springboot.telegrambotfinal.service;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.TrainingSessionDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper.TrainingSessionMapper;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.repository.TrainingSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingSessionService {

    private TrainingSessionRepository trainingSessionRepository;
    private TrainingSessionMapper mapper;

    @Autowired
    public void setTrainingSessionRepository(TrainingSessionRepository trainingSessionRepository, TrainingSessionMapper mapper) {
        this.trainingSessionRepository = trainingSessionRepository;
        this.mapper = mapper;
    }

    public List<TrainingSessionDTO> getAllTrainingSessions() {
        return mapper.toListDTO(trainingSessionRepository.findAll());
    }

    public TrainingSessionDTO saveTrainingSession(TrainingSessionDTO trainingSessionDTO) {
        return mapper.toDTO(trainingSessionRepository.save(mapper.toEntity(trainingSessionDTO)));
    }

    public TrainingSessionDTO getTrainingSessionById(Long id) {
        return mapper.toDTO(trainingSessionRepository.findById(id).orElse(null));
    }

    public void deleteTrainingSession(Long id) {
        trainingSessionRepository.deleteById(id);
    }
}
