package com.yuriyaleksin.spring.springboot.telegrambotfinal.repository;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.TrainingSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainingSessionRepository extends JpaRepository<TrainingSessionEntity, Long> {
}
