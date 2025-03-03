package com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper;

import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.FoodIntakeDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.FoodIntakeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface FoodIntakeMapper {

    FoodIntakeDTO toDTO(FoodIntakeEntity foodIntakeEntity);
    FoodIntakeEntity toEntity(FoodIntakeDTO foodIntakeDTO);

    List<FoodIntakeDTO> toListDTO(List<FoodIntakeEntity> foodIntakeEntities);
    List<FoodIntakeEntity> toListEntity(List<FoodIntakeDTO> foodIntakeDTOS);
}
