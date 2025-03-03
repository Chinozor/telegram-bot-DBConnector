package com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.TrainingSessionDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.TrainingSessionEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TrainingSessionMapper {

    TrainingSessionDTO toDTO(TrainingSessionEntity entity);
    TrainingSessionEntity toEntity(TrainingSessionDTO dto);

    List<TrainingSessionDTO> toListDTO(List<TrainingSessionEntity> entities);
    List<TrainingSessionEntity> toListEntity(List<TrainingSessionDTO> dtos);
}
