package com.yuriyaleksin.spring.springboot.telegrambotfinal.mapper;


import com.yuriyaleksin.spring.springboot.telegrambotfinal.dto.PersonDTO;
import com.yuriyaleksin.spring.springboot.telegrambotfinal.entity.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDTO toDTO(PersonEntity personEntity);
    PersonEntity ToEntity(PersonDTO personDTO);

    List<PersonDTO> toListDTO(List<PersonEntity> personEntities);
    List<PersonEntity> toListEntity(List<PersonDTO> personDTOS);
}
